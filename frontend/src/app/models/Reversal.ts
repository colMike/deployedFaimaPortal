import { Transaction } from './Transaction';
export interface Reversal{
    id: number
    transactionId: string
    approved: boolean
    createdBy: number
    createdAt: number
    approvedBy: number
    approvedAt: number
    TransRefNo: string
    branchCode: string
    description: string
    transaction: Transaction
}