import { User } from './../User';
// import { SysUsersResponse } from './GeneralResponses';
import { DelinkedCustomer } from './../customers';
export interface GeneralDelinkingResponse{
    status: boolean,
    result: string,
    response_code: string,
    data: null
}

export interface DelinkedCustomerListResponse{
    status: boolean,
    result: DelinkedCustomer[],
    response_code: string,
    data: null
}

export interface UserGroupResponse{
    respCode: number,
    respMessage: string,
    status: boolean,
    version: string,
    collection: UserGroup[]
}

export interface UserGroup{
    id: number,
    groupCode: string,
    groupName: string,
    groupTypeID: number,
    active: boolean,
    createdBy: number,
}

export interface SysUsersResponse{
    respCode: number,
    respMessage: string,
    status: boolean,
    version: string,
    collection: User[]
}

export interface ReversalResponse{
    response_code: string;
    response_status: string;
    response_message: string;
    Data: ReversalMiddlewareResponse;
}

export interface ReversalMiddlewareResponse{
    TransId: string,
    OldTransId: string,
    OldVendor_ref: string,
    Amount: string
}

