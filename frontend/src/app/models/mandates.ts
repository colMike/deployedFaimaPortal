export interface Mandates{
    account:string;
    acctName:string;
    pBUNo:string;
    activeStatus:string;
    solID:string;
    signingMandate:string;
    mandateCount:number;
    names:string;//delimiters should be comma i.e kibiwottcyrus,kimkipkeu
    signatories:any; //afis id array string with delimiters
    mandate:string; //should be an array in line with signatories i.e shouldsign;cansign;mustsign;  mustsign,shouldsign
}