export class ReversalReq{
    constructor(
        public transactionId: number,
        public approved: boolean,
        public createdBy: number,
        public createdAt: string,
        public TransRefNo: string,
        public branchCode: string
    ){}
}