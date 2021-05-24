import {BioVerificationReq} from '../../../models/BioVerificationReq';
// import {AdministrationService} from './../services/administration.service';
import {DatePipe} from '@angular/common';
import {BioVerificationFiler} from '../../../models/BioVerificationFilter';
import {ToastrService} from 'ngx-toastr';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
// import {ReportsService} from './../services/reports.service';
import {ParkingReqModel} from '../../../models/BioApproval';
import {Component, OnInit} from '@angular/core';
import {BioVerification} from '../../../models/BioVerification';
import {ReportsService} from '../../services/reports.service';

@Component({
  selector: 'app-users',
  templateUrl: './parking-report.component.html',
  styleUrls: ['./parking-report.component.scss']
})
export class ParkingReportComponent implements OnInit {
  settings = {
    columns: {
      parkingType: {
        title: 'Parking Type',
        filter: true,
        valuePrepareFunction: value => {
          if (value) {
            return value;
          } else {
            return 'NA';
          }
        }
      },
      parkingZone: {
        title: 'Parking Zone',
        filter: true,
        valuePrepareFunction: value => {
          if (value) {
            return value;
          } else {
            return 'NA';
          }
        }
      },
      regNumber: {
        title: 'Reg Number',
        filter: true,
        valuePrepareFunction: value => {
          if (value) {
            return value;
          } else {
            return 'NA';
          }
        }
      },
      carType: {
        title: 'Vehicle Type',
        filter: true,
        valuePrepareFunction: value => {
          if (value) {
            return value;
          } else {
            return 'NA';
          }
        }
      },
      amount: {
        title: 'Amount',
        filter: true,
        valuePrepareFunction: value => {
          if (value) {
            return value;
          } else {
            return 'NA';
          }
        }
      },
      paymentDate: {
        title: 'Date Paid',
        filter: true,
        valuePrepareFunction: date => {
          if (date) {
            return this.datePipe.transform(date, 'short');
          } else {
            return 'NA';
          }
        }
      }
    },
    actions: {
      add: false,
      edit: false,
      delete: false,
      position: 'right'
    },
    pager: {
      perPage: 10
    }
  };

  bioApprovals: any = [
    {
      status: 'Approved',
      id: 1,
      parkingType: 'Daily Parking',
      parkingZone: 'Kiambu',
      regNumber: 'KAC 2020D',
      amount: 100,
      paymentDate: '2020-01-25T14:43:25.404+0000',
      carType: 'Saloon'
    },
    {
      status: 'Denied',
      id: 2,
      parkingType: 'Seasonal Parking',
      parkingZone: 'Buruburu',
      regNumber: 'KAD 2020D',
      paymentDate: '2020-01-25T14:43:25.404+0000',
      amount: 100,
      carType: 'Minivan'
    }
  ];
  form: FormGroup;
  branches: any[];
  branch: any;
  branchs: string[] = [];
  bioVerificationExportData: BioVerification[] = [];
  bioVerificationReq: BioVerificationReq;

  constructor(
    private reportsService: ReportsService,
    private fb: FormBuilder,
    private toastr: ToastrService,
    private datePipe: DatePipe,
    // private apiService: AdministrationService,
    // private reportSvc: ReportsService
  ) {
  }

  ngOnInit() {
    this.form = this.fb.group({
      fromDate: new FormControl('', [Validators.required]),
      toDate: new FormControl('', [Validators.required]),
      branch: new FormControl('', [Validators.required])
    });

    this.reportsService.getAllParkingDetails().subscribe(
      res => {
        console.log(res);
        if (res.status === 200) {
          this.bioApprovals = res.body;
        } else {
          this.toastr.warning('res.message', 'Failed', {timeOut: 4000});
        }
      },
      error => {
        return this.toastr.error('Error Retrieving Report', 'Error!', {
          timeOut: 4000
        });
      }
    );

    // this.apiService.getBranches().subscribe(
    //   data => {
    //     this.branch = data;
    //     this.branches = this.branch.collection;
    //     this.branches.sort((a, b) => (a.branchName > b.branchName) ? 1 : ((b.branchName > a.branchName) ? -1 : 0));
    //     console.log(this.branches);
    //     this.branches.forEach(branch => {
    //       this.branchs.push(branch.branchName);
    //     });
    //     this.branchs.sort();
    //   },
    //   error => {
    //     return this.toastr.error(`There's error in the server`, 'Error!', {
    //       timeOut: 1500
    //     });
    //   }
    // );
  }

  fetchBioApprovals() {
    const bioFilter: BioVerificationFiler = new BioVerificationFiler(
      this.form.get('branch').value,
      this.form.get('fromDate').value,
      this.form.get('toDate').value
    );
    console.log(bioFilter);

    // this.reportsService.getBioVerificationByDateAndBranch(bioFilter).subscribe(
    //   res => {
    //     if (!res.status) {
    //       return this.toastr.warning(res.message, 'Failed', {timeOut: 4000});
    //     } else {
    //       this.bioApprovals = res.approvals;
    //     }
    //   },
    //   err => {
    //     return this.toastr.error('Error Retriving reports', 'Error', {
    //       timeOut: 4000
    //     });
    //   }
    // );
  }

  getPdfReport() {
    this.requestReportExport('p');
  }

  geteCsvReport() {
    this.requestReportExport('e');
  }

  getExcelReport() {
    this.requestReportExport('e');
  }

  requestReportExport(reportType: string) {
    this.bioVerificationExportData = [];
    this.bioApprovals.forEach(appr => {
      const bioVerificationExportData: BioVerification = new BioVerification(
        appr.parkingType,
        appr.parkingZone,
        appr.regNumber,
        appr.carType,
        appr.status,
        appr.branch.branchName,
        this.datePipe.transform(appr.paymentDate, 'short')
      );
      this.bioVerificationExportData.push(bioVerificationExportData);
    });
    this.bioVerificationReq = {
      reportType,
      reportData: this.bioVerificationExportData
    };

    // this.reportSvc.getBioApproval(this.bioVerificationReq).subscribe(
    //   res => {
    //     // const pdfURL = window.URL.createObjectURL(res);
    //     // const popUp = window.open(pdfURL, "_blank");
    //     const fileName = 'BioVerification' + new Date().getTime().toString().substr(5);
    //     saveAs(res, fileName);
    //     // if (!(popUp == null || typeof popUp == "undefined")) popUp.focus();
    //   }
    // );
  }

}
