import { Transaction } from './Transaction';
export interface MultipleTransactionResp{
    status: boolean
    transactions: Transaction[]
}