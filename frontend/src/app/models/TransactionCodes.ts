export class TransactionCodes{
    constructor(
        private _INTRA_FUND_TRANSFER = 1,
        private _BALANCE_INQUIRY = 2,
        private _CASH_WITHDRAWAL = 3,
        private _MINISTATEMENT_INQUIRY = 4,
        private _ACCOUNT_INQUIRY = 5,
        private _BATCH_ACCOUNT_BALANCE_INQUIRY = 6,
        private _REQUEST = 7,
        private _REVERSALS = 8,
        private _CASH_DEPOSIT = 9,
        private _TRANSACTION_INQUIRY = 10,
        private _INTER_FUND_TRANSFER = 11,
    ){}
    get INTER_FUND_TRANSFER(){
        return this._INTER_FUND_TRANSFER
    }
    get REVERSALS(){
        return this._REVERSALS
    }
    get INTRA_FUND_TRANSFER(){
        return this._INTRA_FUND_TRANSFER
    }

    get BALANCE_INQUIRY(){
        return this._BALANCE_INQUIRY
    }

    get CASH_WITHDRAWAL(){
        return this._CASH_WITHDRAWAL
    }

    get MINISTATEMENT_INQUIRY(){
        return this._MINISTATEMENT_INQUIRY
    }

    get ACCOUNT_INQUIRY(){
        return this._ACCOUNT_INQUIRY
    }

    get BATCH_ACCOUNT_BALANCE_INQUIRY(){
        return this._BATCH_ACCOUNT_BALANCE_INQUIRY
    }

    get CASH_DEPOSIT(){
        return this._CASH_DEPOSIT
    }

    get REQUEST(){
        return this._REQUEST
    }

    get TRANSACTION_INQUIRY(){
        return this._TRANSACTION_INQUIRY
    }
}