export class UtilityConstants{
    private _utilities: string[] = ["NWSC", "SCHOOLFEES", "DSTV", "GOTV", "UMEME", "AZAMTV", "STARTIMES", "URA"]
    private _utilityConsts = {
        NWSC: {
            RESIDENCE_AREA_MENU: "select_area_of_residence",
            VALIDATE_MENU: "validate_customer",
            PAY_MENU: "pay_bill",
            UTILITY: "NWSC",
            CHARGE_CODE: 1009,
            RESIDENCE_AREA_ENDPOINT: "nwsc/select_area_of_residence",
            VALIDATE_ENDPOINT: "nwsc/validate_customer",
            PAY_ENDPOINT: "nwsc/pay_bill"
        },
        SCHOOLFEES: {
            VALIDATE_MENU: "SCHOOLPAY_VALIDATE",
            PAY_MENU: "SCHOOLPAY_PAYMENT",
            UTILITY: "SCHOOLFEES",
            CHARGE_CODE: 1010,
            VALIDATE_ENDPOINT: "school_fees/schoolpay_validate",
            PAY_ENDPOINT: "school_fees/schoolpay_payment"
        },
        DSTV: {
            VALIDATE_MENU: "PAYBILL_DSTV_VALIDATE",
            PAY_MENU: "PAYBILL_DSTV_PAYMENT",
            UTILITY: "DSTV",
            CHARGE_CODE: 1011,
            VALIDATE_ENDPOINT: "dstv/paybill_dstv_validate",
            PAY_ENDPOINT: "dstv/paybill_dstv_payment"
        },
        GOTV: {
            VALIDATE_MENU: "PAYBILL_GOTV_VALIDATE",
            PAY_MENU: "PAYBILL_GOTV_PAYMENT",
            UTILITY: "GOTV",
            CHARGE_CODE: 1012,
            VALIDATE_ENDPOINT: "gotv/paybill_gotv_validate",
            PAY_ENDPOINT: "gotv/paybill_gotv_payment"
        },
        UMEME: {
            VALIDATE_MENU: "PAYBILL_UMEME_VALIDATE",
            PAY_MENU: "PAYBILL_UMEME_PAYMENT",
            UTILITY: "UMEME",
            CHARGE_CODE: 1013,
            VALIDATE_ENDPOINT: "umeme/paybill_umeme_validate",
            PAY_ENDPOINT: "umeme/paybill_umeme_payment"
        },
        AZAMTV: {
            VALIDATE_MENU: "PAYBILL_AZAMTV_VALIDATE",
            PAY_MENU: "PAYBILL_AZAMTV_PAYMENT",
            UTILITY: "AZAMTV",
            CHARGE_CODE: 1014,
            PACKEGES_ENDPOINT: "azamtv/paybill_azamtv_packages",
            VALIDATE_ENDPOINT: "azamtv/paybill_azamtv_validate",
            PAY_ENDPOINT: "azamtv/paybill_azamtv_payment"
        },
        STARTIMES: {
            VALIDATE_MENU: "PAYBILL_STARTIMES_VALIDATE",
            PAY_MENU: "PAYBILL_STARTIMES_PAYMENT",
            UTILITY: "STARTIMES",
            CHARGE_CODE: 1015,
            VALIDATE_ENDPOINT: "startimes/paybill_startimes_validate",
            PAY_ENDPOINT: ""
        },
        URA: {
            VALIDATE_MENU: "PAYBILL_URA_VALIDATE",
            PAY_MENU: "PAYBILL_URA_PAYMENT",
            UTILITY: "URA",
            CHARGE_CODE: 1016,
            VALIDATE_ENDPOINT: "ura/validate_customer_with_prn",
            PAY_ENDPOINT: "ura/paybill_ura_branch"
        }
    }

    get utilityConsts(){
        return this._utilityConsts;
    }

    get utilities(): string[]{
        return this._utilities;
    }
}