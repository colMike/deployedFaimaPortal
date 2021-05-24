export class WithdrawalAndDeposit {
  constructor(
    public transaction_code: string,
    public teller_id: string,
    public account_no: string,
    public amount: string,
    public CustomerName: string,
    public teller_account_no: string,
    public transactionCharges: number[],
    public branch_id: string,
    public receipt_number: string
  ) {}
}
