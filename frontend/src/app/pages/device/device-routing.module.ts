import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {DeviceRegComponent} from './deviceRegistration/deviceReg.component';
import {DeviceIssueComponent} from './deviceIssue/deviceIssue.component';
import {ApproveRegistrationComponent} from './approveRegistration/approve-registration.component';
import {ApproveIssueComponent} from './approveIssue/approve-issue.component';
import {DeleteDeviceComponent} from './deleteDevice/delete-device.component';
import {ApproveDeleteComponent} from './approveDelete/approve-delete.component';


const routes: Routes = [

  {

    path: 'deviceRegistration',
    component: DeviceRegComponent

    // canActivate: [ServiceGuard]

  },
  {
    path: 'approveDeviceRegistration',
    component: ApproveRegistrationComponent
  },
  {
    path: 'deviceIssue',
    component: DeviceIssueComponent
  },
  {
    path: 'approveDeviceIssue',
    component: ApproveIssueComponent
  },
  {
    path: 'deleteDevice',
    component: DeleteDeviceComponent
  },
  {
    path: 'approveDeviceDelete',
    component: ApproveDeleteComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DeviceRoutingModule {
}
