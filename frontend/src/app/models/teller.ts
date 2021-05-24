import { User } from './User';
export class Teller{
workClass: string;
tellerLimit:string;
tellerAcct:string;
tellerPbuNo:string;
username:string;
activeStatus:boolean;
id: number;
branch: string;
userId: number;
tellerId: string;
user: User

setTellerPbuNo(tellerPbuNo:string){
    this.tellerPbuNo = tellerPbuNo;
}
}



/*export interface Teller{
    workClass: string;
    tellerLimit:string;
    tellerAcct:string;
    tellerPbuNo:string;
    username:string;
    activeStatus:boolean
    }

    */
