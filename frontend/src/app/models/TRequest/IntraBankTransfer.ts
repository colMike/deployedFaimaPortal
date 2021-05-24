export class IntraBankTransfer {
  constructor(
    public transaction_code: string,
    public teller_id: string,
    public account_no: string,
    public amount: string,
    public CustomerName: string,
    public teller_account_no: string,
    public beneficiary_account: string,
    public beneficiary_name: string,
    public transactionCharges: number[],
    public receipt_number: string,
    public branch_id: string
  ) {}
}
