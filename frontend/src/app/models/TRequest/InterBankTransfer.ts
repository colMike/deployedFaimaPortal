export class InterBankTransfer {
  constructor(
    public transaction_code: string,
    public teller_id: string,
    public account_no: string,
    public amount: string,
    public CustomerName: string,
    public teller_account_no: string,
    public beneficiary_account: string,
    public beneficiary_name: string,
    public beneficiary_phone_no: string,
    public beneficiary_bank: string,
    public receipt_number: string,
    public branch_id: string,
    public transactionCharges: number[],
    public inter_bank_ft_suspence_account: string
  ) {}
}
