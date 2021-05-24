import { BaseResponse } from './BaseResponse';
export interface CashDepositResponse extends BaseResponse{
    Data: {
        Amount: string,
        FromAccount: string,
        ToAccount: string,
        TransId: string,
        debitAccountAvBal: string,
        debitAccountActBal: string
    } 
}