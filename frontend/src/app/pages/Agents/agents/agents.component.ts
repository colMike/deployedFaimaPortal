import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {ToastrService} from 'ngx-toastr';
import {AgentService} from '../../services/agent.service';


@Component({
  selector: 'app-agents',
  templateUrl: './agents.component.html',

  styleUrls: ['./agents.component.scss']
})
export class AgentsComponent implements OnInit {

  // breadcrumb items
  breadCrumbItems: Array<{}>;

  submitted: boolean;
  isExisting: boolean;
  isAddMode: boolean;
  sessionId: any;
  public agents: any = [];
  public response: any = null;

  // agentsData: agents[];
  validationform: FormGroup;

  constructor(private toastr: ToastrService, private modalService: NgbModal, private agentSvc: AgentService, public formBuilder: FormBuilder) {
  }

  /**
   * Returns form
   */
  get form() {
    return this.validationform.controls;
  }

  ngOnInit(): void {
    this.breadCrumbItems = [{label: 'Agents'}, {label: 'agents', active: true}];
    this.gtAgent();


    //this._fetchData();
  }

  initAddAgent(): void {
    this.isAddMode = true;
    this.isExisting = false;


    this.validationform = this.formBuilder.group({


      firstname: ['', [Validators.required]],
      secondname: ['', [Validators.required]],
      agentnames: ['', [Validators.required]],
      agenttype: ['', [Validators.required]],
      dob: ['', [Validators.required]],
      idtype: ['', [Validators.required]],
      idnumber: ['', [Validators.required]],
      email: ['', [Validators.required]],
      gender: ['', [Validators.required]],
      businessmobile: ['', [Validators.required]],
      county: ['', [Validators.required]],
      subcounty: ['', [Validators.required]],
      ward: ['', [Validators.required]]
    });

  }

  initEditAgent(agent) {
    this.isAddMode = false;
    this.isExisting = true;
    this.agents.id = agent.id;
    console.log(agent, 'agent id ................');
    console.log(this.agents.id, 'agent id ................');

    this.validationform = this.formBuilder.group({

      firstname: new FormControl(agent.firstname, Validators.required),
      secondname: new FormControl(agent.secondname, Validators.required),
      dob: new FormControl(agent.dob, Validators.required),
      idtype: new FormControl(agent.idtype, Validators.required),
      idnumber: new FormControl(agent.idnumber, Validators.required),
      email: new FormControl(agent.email, Validators.required),
      gender: new FormControl(agent.gender, Validators.required),
      businessmobile: new FormControl(agent.businessmobile, Validators.required),
      county: new FormControl(agent.county, Validators.required),
      subcounty: new FormControl(agent.subcounty, Validators.required),
      ward: new FormControl(agent.ward, Validators.required),
      approved: new FormControl(agent.approved, Validators.required)

    });

  }


  /*  private _fetchData() {
      this.agentsData = agentsData;
    }*/

  gtAgent() {
    this.isAddMode = false;
    this.agentSvc.gtAgent().subscribe(agent => {
      // if(data){
      this.agents = agent;
      //this.blockUI.stop();
      /* }
       else{*/
      console.log(this.agents, 'data.message');
      // this.blockUI.stop();
      //return this.toastr.info(data.message);
      //}
    }, () => {
      console.log('error fetching customers...');
      //this.blockUI.stop();
    });
  }

  /**
   * Modal Open
   * @param content modal content
   */
  openModal(content: any) {
    this.modalService.open(content, {centered: true});
  }

  updateAgent() {
    //this.agents.agentnames = this.validationform.get('agentnames').value;
    console.log(this.agents.id, ' this.agents.userId');

    this.agents.firstname = this.validationform.get('firstname').value;
    this.agents.secondname = this.validationform.get('secondname').value;
    this.agents.agentnames = this.agents.firstname + ' ' + this.agents.secondname;
    // this.agents.agenttype = this.validationform.get('agenttype').value;
    this.agents.dob = this.validationform.get('dob').value;
    this.agents.idtype = this.validationform.get('idtype').value;
    this.agents.idnumber = this.validationform.get('idnumber').value;
    this.agents.email = this.validationform.get('email').value;
    this.agents.gender = this.validationform.get('gender').value;
    this.agents.businessmobile = this.validationform.get('businessmobile').value;
    this.agents.county = this.validationform.get('county').value;
    this.agents.subcounty = this.validationform.get('subcounty').value;
    this.agents.ward = this.validationform.get('ward').value;

    this.agents.approved = this.validationform.get('approved').value;


    const agent1 = {
      'firstname': this.agents.firstname,
      'secondname': this.agents.secondname,
      'agentnames': this.agents.agentnames,
      // 'agenttype': this.agents.agenttype,
      'dob': this.agents.dob,
      'idtype': this.agents.idtype,
      'idnumber': this.agents.idnumber,
      'email': this.agents.email,
      'gender': this.agents.gender,
      'businessmobile': this.agents.businessmobile,
      'county': this.agents.county,
      'subcounty': this.agents.subcounty,
      'ward': this.agents.ward,
      'approved': this.agents.approved,
    };


    console.log(agent1, '$$$$$$$$$$$$$$$$');
    console.log(this.agents.id, 'this.agents.id');
    this.agentSvc.updateAgent(agent1).subscribe((response) => {
      this.response = response;
      console.log(this.response.status, 'response');
      if (this.response.agentnames) {


        /*   this.usersData.push({
             this.users1.userName,
             userFullName,
             userEmail,
             active,
             userPhone,
             userNationalId
           });*/
        this.validationform = this.formBuilder.group({
          firstname: '',
          secondname: '',
          dob: '',
          idtype: '',
          idnumber: '',
          email: '',
          gender: '',
          businessmobile: '',
          county: '',
          subcounty: '',
          ward: ''
        });

        // logger.info("Great! The user information was saved successfully")
        this.modalService.dismissAll();

        this.gtAgent();
        this.isAddMode = true;
        // alert(response.respMessage);
        return this.toastr.success('Great! The Agent information was updated successfully."', ' Success!', {timeOut: 3000});


      } else {
        return this.toastr.error('Error! The agent information could not be updated."', ' Error!', {timeOut: 3000});

      }
      this.submitted = true;
    });


  }

  cancel() {
    this.gtAgent();
    this.isAddMode = true;
    this.isExisting = true;

  }

  Delete() {

  }

  /**
   * save the contacts data
   */
  saveAgent() {
    this.agents = this.validationform.value;

    this.agents.firstname = this.validationform.get('firstname').value;
    this.agents.secondname = this.validationform.get('secondname').value;
    this.agents.agentnames = this.agents.firstname + ' ' + this.agents.secondname;
    this.agents.agenttype = 1;
    this.agents.dob = this.validationform.get('dob').value;
    this.agents.idtype = this.validationform.get('idtype').value;
    this.agents.idnumber = this.validationform.get('idnumber').value;
    this.agents.email = this.validationform.get('email').value;
    this.agents.gender = this.validationform.get('gender').value;
    this.agents.businessmobile = this.validationform.get('businessmobile').value;
    this.agents.county = this.validationform.get('county').value;
    this.agents.subcounty = this.validationform.get('subcounty').value;
    this.agents.ward = this.validationform.get('ward').value;

    this.agents.approved = false;

    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    console.log(this.sessionId.entity.userId, 'this.users1');
    console.log(this.sessionId.entity, 'this.users1');

    this.agents.maker = this.sessionId.entity.userId;
    console.log(this.agents.maker, 'this.users1.createdBy');
    console.log(this.agents, '++++++++++++++++++++++++++++');

    this.agentSvc.addAgent(this.agents).subscribe((response) => {
      this.response = response;
      if (this.response.agentnames) {
        //if (this.validationform.valid) {
        /* this.agentsData.push({
           agentnames,
           location,
           mobile	,
           branch	,
           business_name,
           email	,
           idnumber	,
           businessmobile,
           firstname,
           secondname,
           last_name,
           super_agent,
           postal_address,
           referees_contacts,
           business_category,
           agenttype	,
           ward

         });*/
        this.validationform = this.formBuilder.group({
          firstname: '',
          secondname: '',
          dob: '',
          idtype: '',
          idnumber: '',
          email: '',
          gender: '',
          businessmobile: '',
          county: '',
          subcounty: '',
          ward: ''
        });

        this.modalService.dismissAll();
        this.gtAgent();
        return this.toastr.success('Great! The Agent information was saved successfully"', ' Success!', {timeOut: 3000});

      } else {
        return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});

      }
      this.submitted = true;
    });
  }

}
