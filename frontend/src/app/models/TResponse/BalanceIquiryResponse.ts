import { BaseResponse } from './BaseResponse';
export interface BalanceInquiryResponse extends BaseResponse{
     Data: {
        Account: string,
        TransId: string,
        Balance: string
    }
}