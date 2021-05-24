import { User } from './User';
import { Branch } from './GeneralModels';
import { Teller } from './teller';
import { TransactionType } from './TransactionType';
export class Transaction {
  transactionType: TransactionType
  id: number
  narration: string
  approved_at: string
  approved_by: string
  teller: Teller
  transaction_status: string
  beneficiaryName:string
  beneficiaryBank: string
  beneficiaryPhone: string
  beneficiaryAccount: string
  exciseDuty: string
  branch: Branch
  authorizer: User
  constructor(
    public accountNumber: string,
    public toAccount: string,
    public amount: any,
    public charge: any,
    public tellerId: number,
    public channelId: number,
    public createdAt: string,
    public transactionTypeId: number,
    public refferenceId: string,
    public branchCode: string,
    public title: string,
    public transactionStatus: string,
    public approvedBy: number,
    public approvedAt: string,
    public acctBal: string,
    public acctName: string,
    public compasRef: string,
    public receiptNo: string
  ) {}
}
