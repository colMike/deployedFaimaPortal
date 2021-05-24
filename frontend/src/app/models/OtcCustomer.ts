export class OtcCustomer{
    verified
    constructor(
       public id: number,
       public name: string,
       public afisid: string,
       public active: boolean,
       public branchId: string,
       public dateOfBirth: string,
       public email: string,
       public fullName: string,
       public gender: string,
       public idNumber: string,
       public phoneNumber: string,
       public postalAddress: string,
       public postalCode: string,
       public postalTown: string,
       public updatedBy: number,
       public updatedAt: string
    ){}
}