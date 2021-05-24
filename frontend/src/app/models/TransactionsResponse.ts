import { Transaction } from './Transaction';
import { GenericResponse } from './GenericResponse';
export interface TransactionsResponse extends GenericResponse{
    result: Transaction[]
}