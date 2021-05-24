export class TellerTransactionReq{
       
    constructor(
        public transactionTypeId: number,
        public tellerId: number
    ){}
}