import {ChargeMatrix} from './../ChargeMatrix';

export interface ChargesResponse {
    transaction_code: number;
    transaction_name: string;
    charge_type: string;
    charge_amount: number;
    charge_percent: number;
    excise_duty: number;
    charge_matrix: ChargeMatrix[];
}
