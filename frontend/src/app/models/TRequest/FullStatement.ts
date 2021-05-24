export class FullStatement {
  constructor(
    public from: string,
    public to: string,
    public transactionCharges: number[],
    public receipt_number: string,
    public branch_id: string,
    public teller_id: string,
    public transaction_code: string,
    public amount: string,
    public account_no: string,
    public CustomerName: string,
    public PhoneNo: string
  ) {}
}
