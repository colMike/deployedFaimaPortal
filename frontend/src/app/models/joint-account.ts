export class JointAccount {
    account: string;
	acctName: string;
	schemeCode: string;
	gLCode: string;
	solID: string;
	pBUNo: string;
	amount: string;
	activeStatus: boolean;
	lienAmount: string;
	closeFlag: string;
	phone: string;
	email: string;
	currency: string;
	signingMandate: string;
	imageData: string;
	afisStatus: boolean;

	setAccount(account) {
		this.account = account;
		console.log('passed account' + this.account);
	}
	setAccountName(acctName) {
		this.acctName = acctName;
	}
	setSchemeCode(schemeCode) {
		this.schemeCode = schemeCode;
	}
	setGlCode(gLCode) {
		this.gLCode = gLCode;
	}
	setSolID(solID) {
		this.solID = solID;
	}
	setPbuNo(pBUNo) {
		this.pBUNo = pBUNo;
	}
	setAmount(amount) {
		this.amount = amount;
	}
	setActiveStatus(activeStatus) {
		this.activeStatus = activeStatus;
	}
	setLienAmount(lienAmount) {
		this.lienAmount = lienAmount;
	}
	setCloseFlag(closeFlag) {
		this.closeFlag = closeFlag;
	}
	setPhone(phone) {
		this.phone = phone;
	}
	setEmail(email) {
		this.email = email;
	}
	setSigningMandate(signingMandate) {
		this.signingMandate = signingMandate;
	}
setImageData(imageData) {
this.imageData = imageData;
}
	setAfisStatus(afisStatus) {
		this.afisStatus = afisStatus;
	}
	setCurrency(currency) {
		this.currency = currency;
	}
}
