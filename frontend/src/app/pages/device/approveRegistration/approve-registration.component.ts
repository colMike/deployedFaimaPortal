import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {ToastrService} from 'ngx-toastr';

import {BlockUI, NgBlockUI} from 'ng-block-ui';
import {DeviceService} from '../../services/device.service';
import {DOCUMENT} from '@angular/common';


@Component({
  selector: 'app-device-registration',
  templateUrl: './approve-registration.component.html'

})
export class ApproveRegistrationComponent implements OnInit {


  // breadcrumb items
  breadCrumbItems: Array<{}>;
  public devicesArray: any = [];
  public region1: any = [];
  public subCountys: any = [];
  submitted: boolean;
  public response: any = null;
  isAddMode: boolean;
  isExisting: boolean;
  subCountyId: any;
  sessionId: any;
  status: any;
  storageObject: any = {};
  @BlockUI() blockUI: NgBlockUI;


  deviceForm: FormGroup;

  // constructor(private modalService: NgbModal, public formBuilder: FormBuilder) { }
  constructor(private toastr: ToastrService,
              private deviceRegSvc: DeviceService, @Inject(DOCUMENT) private document: any, public formBuilder: FormBuilder,
              private modalService: NgbModal
  ) {
  }


  get form() {
    return this.deviceForm.controls;
  }

  ngOnInit(): void {

    this.getDevices();

  }

  initEditDevice(device) {
    this.isAddMode = false;
    this.isExisting = true;
    this.devicesArray.deviceid = device.deviceid;
    console.log(this.devicesArray.subCountyId, 'subCounty id ................');


    this.deviceForm = this.formBuilder.group({
      deviceimei: new FormControl({value: device.deviceimei, disabled: true}, Validators.required),
      active: new FormControl(device.active === 'false' ? false : true, Validators.required),
      deviceid: new FormControl(device.deviceid, Validators.required)

    });

  }

  cancel() {
    this.getDevices();
    this.isAddMode = true;
    this.isExisting = true;

  }

  getDevices() {
    this.blockUI.start('Loading registered devices');
    this.isAddMode = false;
    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    console.log(this.sessionId.entity.subCountyId, 'this.devicesArray');
    console.log(this.sessionId.entity, 'this.devicesArray');

    this.deviceRegSvc.gtDevicesToApprove().subscribe(dev => {

      this.devicesArray = dev;
      this.blockUI.stop();

      for (let i = 0; i <= this.devicesArray.length - 1; i++) {
        console.log(this.devicesArray[i].approved, 'this.devicesArray.approved');


        if (this.devicesArray[i].approved === 'N') {

          this.devicesArray[i].approved = 'Pending Approval';
          console.log(this.devicesArray[i].approved, '$$$$$$$$$$$$$$$$$$$$');
        } else {
          this.devicesArray[i].approved = 'Approved';
        }
        console.log(this.devicesArray, 'data.message');
        // this.blockUI.stop();
        // return this.toastr.info(data.message);
        // }
      }
    }, () => {
      console.log('error fetching customers...');
      this.blockUI.stop();
    });
  }


  checkItem() {
    return this.form.active.value === 'true' ? true : false;
  }

  Approve() {

    this.blockUI.start('Saving device Authorization');
    console.log(this.devicesArray.deviceid, ' this.device id');
    this.devicesArray.approved = true;
    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    this.devicesArray.checker = this.sessionId.entity.userId;


    // tslint:disable-next-line:triple-equals
    if (this.devicesArray.maker == this.devicesArray.checker) {

      return this.toastr.warning('You cannot approve a device you created', 'Warning!', {timeOut: 3000});


    }

    console.log('this.devicesArray.agentid');
    console.log(this.devicesArray.agentid);

    const deviceToApprove = {
      deviceid: this.devicesArray.deviceid,
      approved: this.devicesArray.approved,
      checker: this.devicesArray.checker

    };


    console.log(deviceToApprove, '$$$$$$$$$$$$$$$$');
    console.log(this.devicesArray.id, 'this.devicesArray.id');
    this.deviceRegSvc.approveDeviceReg(deviceToApprove).subscribe((response) => {
      this.blockUI.stop();
      this.response = response;


      if (this.response.status === 200) {
        this.deviceForm = this.formBuilder.group({
          deviceImei: '',
          active: '',
          deviceid: ''
        });

        // logger.info("Great! The user information was saved successfully")
        this.modalService.dismissAll();

        this.getDevices();
        this.isAddMode = true;
        // alert(response.respMessage);
        return this.toastr.success('Great! The Device information was approved successfully"', ' Success!', {timeOut: 3000});


      } else {
        return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});

      }
      this.submitted = true;
    }, error => {
      this.blockUI.stop();
      return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});
    });

  }

  Reject() {
    this.blockUI.start('Saving device Authorization');
    console.log(this.devicesArray.deviceid, ' this.device id');
    this.devicesArray.approved = true;
    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    this.devicesArray.checker = this.sessionId.entity.userId;


    // tslint:disable-next-line:triple-equals
    if (this.devicesArray.maker == this.devicesArray.checker) {

      return this.toastr.warning('You cannot approve a device you created', 'Warning!', {timeOut: 3000});


    }

    console.log('this.devicesArray.agentid');
    console.log(this.devicesArray.agentid);

    const deviceToApprove = {
      deviceid: this.devicesArray.deviceid,
      approved: this.devicesArray.approved,
      checker: this.devicesArray.checker

    };


    console.log(deviceToApprove, '$$$$$$$$$$$$$$$$');
    console.log(this.devicesArray.id, 'this.devicesArray.id');
    this.deviceRegSvc.approveDeviceReg(deviceToApprove).subscribe((response) => {
      this.blockUI.stop();
      this.response = response;


      if (this.response.status === 200) {
        this.deviceForm = this.formBuilder.group({
          deviceImei: '',
          active: '',
          deviceid: ''
        });

        // logger.info("Great! The user information was saved successfully")
        this.modalService.dismissAll();

        this.getDevices();
        this.isAddMode = true;
        // alert(response.respMessage);
        return this.toastr.success('Great! The Device information was rejected successfully"', ' Success!', {timeOut: 3000});


      } else {
        return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});

      }
      this.submitted = true;
    }, error => {
      this.blockUI.stop();
      return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});
    });
  }

}
