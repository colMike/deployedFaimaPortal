export interface DelinkingRequest {
  customerId: number;
  initiatorId: number;
  delinkingReason: string;
}

export class ReversalRequest {
  constructor(
    public OldTransId: string,
    public Amount: string,
    public TransRefNo: string,
    public ReceiptNo: string,
    public Account: string,
    public TellerId: string,
    public BranchId: string
  ) {}
}
