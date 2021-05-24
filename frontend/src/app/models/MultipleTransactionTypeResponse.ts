import { TransactionType } from './TransactionType';
export interface MultipleTransactionTypeResponse{
    status: boolean
    statusCode: string
    transactionTypes: TransactionType[]
}