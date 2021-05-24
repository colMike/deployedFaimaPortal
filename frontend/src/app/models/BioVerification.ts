export class BioVerification{
    constructor(
        public oppName: string,
        public custName: string,
        public custAcct: string,
        public authorizer: string,
        public status: string,
        public branch: string,
        public apprDate: string
    ){}
}