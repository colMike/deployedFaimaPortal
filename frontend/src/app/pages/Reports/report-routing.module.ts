import {AuditTrailComponent} from './auditTrail/auditTrail.component';

import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {ServiceGuard} from '../services/service.guard';
import {ParkingReportComponent} from './parking/parking-report.component';

const routes: Routes = [

  {
    path: 'auditTrail',
    component: AuditTrailComponent,
    canActivate: [ServiceGuard]
  },
  {
    path: 'parkingReport',
    component: ParkingReportComponent
  }


];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class reportRoutingModule {
}
