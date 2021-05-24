import {ChargesResponse} from './ChargeResponse';

export interface GeneralChargeResponse {
    response_status: boolean;
    response_message: string;
    data: ChargesResponse[];
}
