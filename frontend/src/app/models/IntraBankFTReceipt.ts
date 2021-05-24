export class IntraBankFTReceipt{
    constructor(
        public receiptNo: string,
        public branch: string,
        public toAccount: string,
        public receiverBank: string,
        public acctNumber: string,
        public amount: string,
        public charge: string,
        public tellerName: string,
        public transaRef: string,
        public transName: string,
        public totalAmount: string,
        public exciseDuty: string,
        public narration:string
    ){}
}