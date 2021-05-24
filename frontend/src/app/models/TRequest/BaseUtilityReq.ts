export class BaseUtilityReq{
    constructor(
       public CustRef,
       public PhoneNo,
       public AreaId,
       public amount,
       public menu,
       public utility,
       public branch_id,
       public teller_id,
       public transactionCharges: number[],
       public receipt_number,
       public account_to,
       public account_from,
       public DeviceId
    ){}
}