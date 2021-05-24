import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Urls} from './url';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DeviceService {

  API_URL = new Urls();

  constructor(private http: HttpClient) {
  }

  /*  updUser (customer) {
      return this.http.post(`${this.API_URL.url}/store` , customer);
    }*/
  gtDevice(): Observable<any> {
    return this.http.get(`${this.API_URL.url}/Device_linkingService/viewDevice_linking`);
  }

  getPosUsers(): Observable<any> {
    return this.http.get(`${this.API_URL.url}/Device_linkingService/getAgentToIssueDevice`);
  }

  getDevicesToIssue(): Observable<any> {
    return this.http.get(`${this.API_URL.url}/Device_linkingService/getDevicesToIssue`);
  }

  addDevice(device): Observable<any> {
    return this.http.put(`${this.API_URL.url}/Device_linkingService/addDevice_linking`, device);
  }

  addDeviceReg(device): Observable<any> {
    return this.http.post(`${this.API_URL.url}/Device_linkingService/addDevice`, device);
  }
  approveDeviceReg(device): Observable<any> {
    return this.http.put(`${this.API_URL.url}/Device_linkingService/approveDevice`, device, {observe: 'response'});
  }

  gtDeviceReg(): Observable<any> {
    return this.http.get(`${this.API_URL.url}/Device_linkingService/viewDevice`);
  }

  gtDeletedDevicesToApprove(): Observable<any> {
    return this.http.get(`${this.API_URL.url}/Device_linkingService/viewDevicesToApproveDelete`);
  }

  gtDevicesToApprove(): Observable<any> {
    return this.http.get(`${this.API_URL.url}/Device_linkingService/viewDevicesToApprove`);
  }

  deleteDevice(device): Observable<any> {
    return this.http.put(`${this.API_URL.url}/Device_linkingService/deleteDevice`, device);
  }

  approveDeviceDeletion(device): Observable<any> {
    return this.http.put(`${this.API_URL.url}/Device_linkingService/approveDeleteDevice`, device);
  }

}
