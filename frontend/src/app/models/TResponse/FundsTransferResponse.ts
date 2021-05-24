import { BaseResponse } from './BaseResponse';
export interface FundsTransferResponse extends BaseResponse{
    Data: {
        Amount: string,
        FromAccount: string,
        ToAccount: string,
        TransId: string,
        debitAccountAvBal: string,
        debitAccountActBal: string
    }
}