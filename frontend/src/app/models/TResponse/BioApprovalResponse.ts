import { BioApproval, ParkingReqModel } from './../BioApproval';
export interface BioApprovalResponse{
    status: boolean,
    message: string,
    status_code: string,
    approvals: ParkingReqModel[]
}
