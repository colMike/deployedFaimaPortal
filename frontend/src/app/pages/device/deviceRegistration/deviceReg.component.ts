import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';


import {ToastrService} from 'ngx-toastr';


import {DOCUMENT} from '@angular/common';

import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {DeviceService} from '../../services/device.service';
import {BlockUI, NgBlockUI} from 'ng-block-ui';


@Component({
  selector: 'app-subCountys',
  templateUrl: './deviceReg.component.html',


})
export class DeviceRegComponent implements OnInit {

  // breadcrumb items
  breadCrumbItems: Array<{}>;
  public Device1: any = [];
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

  // subCountysData: subCountys[];

  deviceForm: FormGroup;

  // constructor(private modalService: NgbModal, public formBuilder: FormBuilder) { }
  constructor(private toastr: ToastrService,
              private deviceRegSvc: DeviceService, @Inject(DOCUMENT) private document: any, public formBuilder: FormBuilder,
              private modalService: NgbModal
  ) {
  }

  /**
   * Returns form
   */
  get form() {
    return this.deviceForm.controls;
  }


  /*  private _fetchData() {
      this.subCountysData = subCountysData;
    }*/

  ngOnInit(): void {

    // this.blockUI.start('Loading device data...');

    this.getDevices();
    // this.initAddsubCounty();
    // this.initEditsubCounty();
    /*  this.breadCrumbItems = [{ label: 'Ecommerce' }, { label: 'subCountys', active: true }];*/

    /* this.deviceForm = this.formBuilder.group({
       DeviceName: ['', [Validators.required]],
       subCountyFullName: ['', [Validators.required]],
       subCountyPhone: ['', [Validators.required]],
       subCountyEmail: ['', [Validators.required, Validators.pattern('[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$')]],
       active: ['', [Validators.required]],
       subCountyNationalId: ['', [Validators.required]]
     });
 */
    // this._fetchData();*/
  }

  initAddDevice(): void {
    this.isAddMode = true;
    this.isExisting = false;


    this.deviceForm = this.formBuilder.group({
      deviceimei: ['', [Validators.required]],
      active: [false, [Validators.required]],


    });

  }

  /**
   * Modal Open
   * @param content modal content
   */
  openModal(content: any) {
    this.isAddMode = true;
    this.modalService.open(content, {centered: true});
  }

  /**
   * save the subCountys data
   */
  saveData() {

    this.blockUI.start('Loading Devices');

    const deviceToSave = this.deviceForm.value;

    deviceToSave.deviceimei = this.deviceForm.get('deviceimei').value;
    deviceToSave.active = this.deviceForm.get('active').value;


    // this.Device1.subCountyFullName=(+ this.deviceForm.get('secondname').value +this.deviceForm.get('lastname').value;
    console.log(this.Device1, 'subCountys');
    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    console.log(this.sessionId.entity.subCountyId, 'this.Device1');
    console.log(this.sessionId.entity, 'this.Device1');

    deviceToSave.createdby = this.sessionId.entity.userId;
    console.log(this.Device1.createdby, 'this.Device1.createdby');

    this.deviceRegSvc.addDeviceReg(deviceToSave).subscribe((result) => {

      this.blockUI.stop();
      console.log('result');
      console.log(result);

      this.response = result;
      if (this.response.deviceid) {
        //  logger.info("Great! The subCounty information was saved successfully")
        this.modalService.dismissAll();
        this.getDevices();
        return this.toastr.success('Great! The device registration details were saved successfully', ' Success!', {timeOut: 3000});

        //  alert("Great! The subCounty information was saved successfully");

      } else {
        return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});

      }
      this.submitted = true;
    }, er => {
      this.blockUI.stop();
      console.log(JSON.stringify(er));

      // if (error.message === 'Record already exists') {

      this.modalService.dismissAll();
      this.getDevices();

      return this.toastr.warning('Sorry, This device is already registered.', ' Warning!', {timeOut: 3000});

      // }
    });
  }

  initEditDevice(device) {
    this.isAddMode = false;
    this.isExisting = true;
    this.Device1.deviceid = device.deviceid;
    console.log(this.Device1.subCountyId, 'subCounty id ................');


    this.deviceForm = this.formBuilder.group({
      deviceimei: new FormControl(device.deviceimei, Validators.required),
      active: new FormControl(device.active === 'false' ? false : true, Validators.required),
      deviceid: new FormControl(device.deviceid, Validators.required)

    });

  }

  cancel() {
    this.getDevices();
    this.isAddMode = true;
    this.isExisting = true;

  }

  updateDevice() {
    this.blockUI.start('Loading');
    // this.Device1.subCountyId=this.subCountys.subCountyId;
    // this.Device1.subCountyId = this.deviceForm.get('Device1').value;

    // this.Device1.subCountyId=this.subCountyId;


    console.log(this.Device1.subCountyId, ' this.Device1.subCountyId');
    this.Device1.deviceimei = this.deviceForm.get('deviceimei').value;
    this.Device1.active = this.deviceForm.get('active').value;
    this.Device1.deviceid = this.deviceForm.get('deviceid').value;

    const subCounty2 = {
      'deviceid': this.Device1.deviceid,
      'deviceimei': this.Device1.deviceimei,
      'active': this.Device1.active,


    };
    console.log(subCounty2, '$$$$$$$$$$$$$$$');
    console.log(this.Device1, '$$$$$$$$$$$$$$$$');
    this.deviceRegSvc.addDeviceReg(subCounty2).subscribe((response) => {
      this.blockUI.stop();
      this.response = response;
      console.log(this.response.status, 'response');
      if (this.response.deviceid) {


        // logger.info("Great! The subCounty information was saved successfully")

        this.modalService.dismissAll();


        // alert(response.respMessage);

        this.getDevices();
        this.isAddMode = true;

        // alert(response.respMessage);
        return this.toastr.success('The device registration details were saved successfully', ' Success!', {timeOut: 3000});


      } else {
        return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});

      }
      this.submitted = true;
    });
  }

  getDevices() {
    //  this.blockUI.start("Loading data....");
    this.isAddMode = false;
    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    console.log(this.sessionId.entity.subCountyId, 'this.Device1');
    console.log(this.sessionId.entity, 'this.Device1');

    this.deviceRegSvc.gtDeviceReg().subscribe(dev => {
      // if(data){


      this.Device1 = dev;


      // this.blockUI.stop();
      /* }
       else{*/
      for (var i = 0; i <= this.Device1.length - 1; i++) {
        console.log(this.Device1[i].approved, 'this.Device1.approved');


        if (this.Device1[i].approved === 'N') {

          this.Device1[i].approved === 'Pending Approval';
          console.log(this.Device1[i].approved, '$$$$$$$$$$$$$$$$$$$$');
        } else {
          this.Device1[i].approved === 'Approved';
        }
        console.log(this.Device1, 'data.message');
        // this.blockUI.stop();
        // return this.toastr.info(data.message);
        // }
      }
    }, () => {
      console.log('error fetching customers...');
      // this.blockUI.stop();
    });
  }


  checkItem() {

    return this.form.active.value === 'true' ? true : false;
  }
}
