export class User {
    id: number;
    email: string;
    firstName: string;
    fullName: string;
    phone: string;
    surName: string;
    username: string;
    otherNames: string;
    group: number;
    createdBy: number;
    status: boolean;
    approved: string;
    approvedBy: number;
    approvedOn: string;
    logged_in: string;
    branchId: string;
    afisId: string;
    afisStatus: boolean;
    createdAt: string;
    passwordUpdate: string;
}

export class ReportUser {
    constructor(
        public email: string,
        public firstName: string,
        public fullName: string,
        public phone: string,
        public surName: string,
        public username: string,
        public otherNames: string,
        public group: string,
        public createdBy: string,
        public status: string,
        public approved: string,
        public approvedBy: string,
        public branchId: string,
        public afisStatus: string,
        public createdAt: string,
        public approvedOn: string,
        public updatedAt: string,
        public updatedBy: string,
    ) {
    }
}
