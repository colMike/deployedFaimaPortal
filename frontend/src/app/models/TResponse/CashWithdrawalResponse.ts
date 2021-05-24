import { BaseResponse } from './BaseResponse';
export interface CashWithdrawalResponse extends BaseResponse{
    Data: {
        Amount: string,
        FromAccount: string,
        ToAccount: string,
        TransId: string,
        debitAccountAvBal: string,
        debitAccountActBal: string
    }
}