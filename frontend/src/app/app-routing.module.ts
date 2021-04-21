import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AuthGuard} from './core/guards/auth.guard';


import {LayoutComponent} from './layouts/layout/layout.component';
import {LoginComponent} from './account/auth/login/login.component';

const routes: Routes = [
  {path: 'account', loadChildren: () => import('./account/account.module').then(m => m.AccountModule)},
  // tslint:disable-next-line: max-line-length
  {
    path: 'login',
    component: LoginComponent,
    loadChildren: () => import('./account/auth/auth.module').then(m => m.AuthModule),
    canActivate: [AuthGuard]
  },

  {
    path: '',
    component: LayoutComponent,
    loadChildren: () => import('./pages/pages.module').then(m => m.PagesModule),
    canActivate: [AuthGuard]
  },
  {path: 'pages', loadChildren: () => import('./extrapages/extrapages.module').then(m => m.ExtrapagesModule), canActivate: [AuthGuard]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {scrollPositionRestoration: 'top'})],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
