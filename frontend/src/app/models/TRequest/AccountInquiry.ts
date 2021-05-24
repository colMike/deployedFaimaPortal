export class Accountinquiry {
  
  constructor(
    public transaction_code: string,
    public teller_id: string,
    public account_no: string,
    public branch_id: string,
    public receipt_number: string

  ) {}
}
