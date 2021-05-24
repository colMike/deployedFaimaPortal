import { MinistatementObj } from './../MinistatementObj';
export class MinistatementReq{
    constructor(
        public tellerName: string,
        public receiptType: string,
        public acctNumber: string,
        public acctName: string,
        public customerId: string,
        public charge: string,
        public ministatement: MinistatementObj[]
    ){}
}