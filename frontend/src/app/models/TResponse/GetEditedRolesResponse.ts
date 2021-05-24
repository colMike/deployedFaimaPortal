import {EditRolesResponse} from './EditRolesResponse';

export interface GetEditedRolesResponse {
    
    status: boolean;
    result: EditRolesResponse[];
    response_code: string;
    data: string;
}
