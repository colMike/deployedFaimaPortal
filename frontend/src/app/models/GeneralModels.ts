import {User} from './User';

export interface SystemUser {
    username: string;
    rightId: number;
    groupId: number;
}

export interface ConfigsResponse {
    status: boolean;
    result: Configs;
}

export interface Configs {
    tellerApi: string;
    memApi: string;
    eafisUrl: string;
    reportUrl: string;
    otcUrl: string;
    captureUrl: string;
    eafisClientUrl: string;
    transactionsUrl: string;
}

export interface RoleBasedReportResp {
    responseCode: number
    status: boolean
    collection: RoleBasedReport[]
}

export interface RoleBasedReport {
    id: number;
    groupCode: string;
    groupName: string;
    groupTypeID: number;
    active: boolean;
    createdBy: User;
    modifiedBy: User;
    createdOn: string;
    modifiedOn: string;
    roles: Role[];
}

export class RoleBasedReportExp {
    constructor(
        public groupCode: string,
        public groupName: string,
        public roles: string,
        public createdBy: string,
        public modifiedBy: string,
        public createdOn: string,
        public modifiedOn: string
    ) {
    }
}

export class OverrideTransactionExport {
    constructor(
        public accountNumber: string,
        public amount: string,
        public authorizedAt: string,
        public authorizer: string,
        public branch: string,
        public charge: string,
        public createdAt: string,
        public refferenceId: string,
        public tellerName: string,
        public toAccount: string,
        public status: string,
        public transactionType: string
    ) {
    }
}

export class RoleBaseReportExpReq {
    constructor(
        public reportType: string,
        public reportData: RoleBasedReportExp[]
    ) {
    }
}

export class OverrideTransactionExpReq {
    constructor(
        public reportType: string,
        public reportData: OverrideTransactionExport[]
    ) {
    }
}

export interface Role {
    title: string
}

export interface Branch {
    branchCode: string;
    branchName: string;
    createdBy: number;
    districtId: number;
    id: number;
    territoryId: number;
}

export interface DeduplicationCustomer {
    id: number;
    account: string;
    acctName: string;
    pBUNo: string;
    solID: string;
    signingMandate: string;
    user: User;
    branch: Branch;
    createdAt: string;
}

export class DeduplicationCustomerExport {
    public id: number;
    public account: string;
    public acctName: string;
    public pBUNo: string;
    public solID: string;
    public signingMandate: string;
    public user: string;
    public branch: string;
    public createdAt: string;

    constructor(
        id: number,
        account: string,
        acctName: string,
        pBUNo: string,
        solID: string,
        signingMandate: string,
        user: string,
        branch: string,
        createdAt: string
    ) {

        this.id = id;
        this.account = account;
        this.acctName = acctName;
        this.pBUNo = pBUNo;
        this.solID = solID;
        this.signingMandate = signingMandate;
        this.user = user;
        this.branch = branch;
        this.createdAt = createdAt;
    }
}

export interface DeduplicationExportReq {
    reportType: string;
    reportData: DeduplicationCustomerExport[];
}

export interface DeduplicationCustomerRes {
    status: boolean;
    result: DeduplicationCustomer[];
}
