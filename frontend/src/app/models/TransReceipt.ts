export class TransReceipt{
    constructor(
      public transaRef: string,
      public acctName: string,
      public acctNumber: string,
      public acctTo: string,
      public amount: string,
      public branch: string,
      public acctBal: string,
      public tellerName: string,
      public charge: string,
      public receiptNo: string
    ){}
}