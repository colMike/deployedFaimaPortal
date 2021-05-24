import { BaseResponse } from './BaseResponse';
export interface MinistatementRes extends BaseResponse{
    Data: {
        Account: string
        TransId: string
        Transactions: string[]
    }
}