export class BalanceAndMinistatement {
  
  constructor(
    public transaction_code: string,
    public teller_id: string,
    public account_no: string,
    public amount: string,
    public CustomerName: string,
    public transactionCharges: number[],
    public receipt_number: string,
    public branch_id: string
  ) {}
}
