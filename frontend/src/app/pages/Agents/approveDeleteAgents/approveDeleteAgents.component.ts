import {Component, OnInit} from '@angular/core';
// @ts-ignore
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {ToastrService} from 'ngx-toastr';
// @ts-ignore
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';

// @ts-ignore
import {AgentService} from '../../services/agent.service';


@Component({
  selector: 'app-agents', templateUrl: './approveDeleteAgents.component.html'

})
export class approveDeleteAgentsComponent implements OnInit {

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
    this.agents.maker = agent.maker;
    this.agents.deletedBy = agent.deletedBy;

    this.agents.agentid = agent.agentid;
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
    this.agentSvc.getAgentsToApproveDelete().subscribe(agent => {
      // if(data){
      this.agents = agent;
      // this.blockUI.stop();
      /* }
       else{*/
      console.log(this.agents, 'data.message');
      // this.blockUI.stop();
      // return this.toastr.info(data.message);
      // }
    }, () => {
      console.log('error fetching customers...');
      //this.blockUI.stop();
    });
  }

  Reject() {
    // this.agents.agentnames = this.validationform.get('agentnames').value;
    console.log(this.agents.id, ' this.agents.userId');
    this.agents.deleted = false;

    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    console.log(this.sessionId.entity.userId, 'this.users1');
    console.log(this.sessionId.entity, 'this.users1');
    this.agents.approvedBy = this.sessionId.entity.userId;

    if (this.agents.deletedBy == this.agents.approvedBy) {

      return this.toastr.warning('A user who deletes an agent cannot reject the deletion', ' Warning!', {timeOut: 3000});


    }

    const agent1 = {
      'agentid': this.agents.agentid,
      'deletedby': this.sessionId.entity.userId,
    };


    console.log(agent1, '$$$$$$$$$$$$$$$$');
    console.log(this.agents.id, 'this.agents.id');
    this.agentSvc.approveDeleteAgent(agent1).subscribe((response) => {
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
          ward: '',

        });

        //logger.info("Great! The user information was saved successfully")
        this.modalService.dismissAll();

        this.gtAgent();
        this.isAddMode = true;

        return this.toastr.success('Great! The Agent information was rejected successfully', ' Warning!', {timeOut: 3000});


      } else {

      }
      this.submitted = true;
    });

  }

  /**
   * Modal Open
   * @param content modal content
   */
  openModal(content: any) {
    this.modalService.open(content, {centered: true});
  }

  Approve() {
    //this.agents.agentnames = this.validationform.get('agentnames').value;
    console.log(this.agents.id, ' this.agents.userId');
    // this.agents.deleted = 'AD';
    const session = localStorage.getItem('currentUser');

    this.sessionId = JSON.parse(session);

    console.log(this.sessionId.entity.userId, 'this.users1');
    console.log(this.sessionId.entity, 'this.users1');
    this.agents.approvedBy = this.sessionId.entity.userId;

    if (this.agents.deletedBy == this.agents.approvedBy) {
      return this.toastr.warning('A user who deletes an agent cannot approve the deletion', ' Warning!', {timeOut: 3000});


    }

    const agent1 = {
      'agentid': this.agents.agentid,
      'deletedby': this.sessionId.entity.userId

    };


    console.log(agent1, '$$$$$$$$$$$$$$$$');
    console.log(this.agents.agentid, 'this.agents.id');
    this.agentSvc.approveDeleteAgent(agent1).subscribe((response) => {
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

        //logger.info("Great! The user information was saved successfully")
        this.modalService.dismissAll();


        //alert(response.respMessage);
        this.gtAgent();
        this.isAddMode = true;
        return this.toastr.success('Great! The Agent information was approved successfully', ' Warning!', {timeOut: 3000});


      } else {
        return this.toastr.error('Exception Occurred', ' Error!', {timeOut: 3000});

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
    this.agents.agent_names = this.validationform.get('agent_names').value;
    this.agents.location = this.validationform.get('location').value;
    this.agents.mobile = this.validationform.get('mobile').value;
    this.agents.branch = this.validationform.get('branch').value;
    this.agents.business_name = this.validationform.get('business_name').value;
    this.agents.email = this.validationform.get('email').value;
    this.agents.id_number = this.validationform.get('id_number').value;
    this.agents.business_mobile = this.validationform.get('business_mobile').value;
    this.agents.first_name = this.validationform.get('first_name').value;
    this.agents.second_name = this.validationform.get('second_name').value;
    this.agents.last_name = this.validationform.get('last_name').value;
    this.agents.super_agent = this.validationform.get('super_agent').value;
    this.agents.postal_address = this.validationform.get('postal_address').value;
    this.agents.referees_contacts = this.validationform.get('referees_contacts').value;
    this.agents.business_category = this.validationform.get('business_category').value;
    this.agents.agent_type = this.validationform.get('agent_type').value;
    this.agents.ward = this.validationform.get('ward').value;

    console.log(this.agents, '++++++++++++++++++++++++++++');

    this.agentSvc.addAgent(this.agents).subscribe((response) => {
      this.response = response;
      console.log(this.response.status, 'response');
      if (this.response.status === 200) {
        //if (this.validationform.valid) {
        /* this.agentsData.push({
           agentnames,
           location,
           mobile	,
           branch	,
           business_name,
           email	,
           id_number	,
           business_mobile,
           first_name,
           second_name,
           last_name,
           super_agent,
           postal_address,
           referees_contacts,
           business_category,
           agenttype	,
           ward

         });*/
        this.validationform = this.formBuilder.group({
          agent_names: '',
          location: '',
          mobile: '',
          branch: '',
          business_name: '',
          email: '',
          id_number: '',
          business_mobile: '',
          first_name: '',
          second_name: '',
          last_name: '',
          super_agent: '',
          postal_address: '',
          referees_contacts: '',
          business_category: '',
          agent_type: '',
          ward: '',

        });
        this.modalService.dismissAll();
        this.gtAgent();
        alert('Great! The user information was saved successfully');

      } else {

      }
      this.submitted = true;
    });
  }

}
