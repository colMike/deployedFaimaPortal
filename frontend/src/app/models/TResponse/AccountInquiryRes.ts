import { BaseResponse } from './BaseResponse';
import { AccountRes } from './AccountRes';
export interface AccountInquiryRes extends BaseResponse{
    Data: AccountRes
}