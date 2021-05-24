export class BioApproval {
  status: string;

  constructor(
    public id: number,
    public parkingType: string,
    public parkingZone: string,
    public regNumber: string,
    public paymentDate: string,
    public amount: number,
    public carType: string
  ) {
  }
}

export class ParkingReqModel {
  status: string;

  constructor(
    public id: number,
    public parkingType: string,
    public parkingZone: string,
    public regNumber: string,
    public paymentDate: string,
    public amount: number,
    public carType: string
  ) {
  }
}
