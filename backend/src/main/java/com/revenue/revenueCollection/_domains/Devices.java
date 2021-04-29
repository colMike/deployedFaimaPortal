package com.revenue.revenueCollection._domains;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;


@Entity
@TableGenerator(name = "Devices")
public class Devices implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ID;
    private String DEVICEIMEI;
    private String DEVICEMOBILENUMBER;
    private String AGENTID;
    private String CREATEDBY;
    private Date CREATEDON;
    private Integer APPROVED;
    private String APPROVEDBY;
    private Date APPROVEDON;
    private Integer REWORKED;
    private Date REWORKEDON;
    private String REWORKEDBY;
    private String REWORKREMARKS;
    private boolean ASSIGNED;
    private boolean DECLINED;
    private String DECLINEDON;
    private String DECLINEDBY;
    private boolean DELETED;
    private String DELETEDBY;
    private Date DELETEDON;
    private String AGENTIDNUMBER;
    private String REMARKS;
    private String CHECKERREMARKS;
    private String DEVICETYPE;
    private String PIN;
    private String LINKMAKER;
    private boolean LINKAPPROVED;
    private String AGENTNAMES;
    private Timestamp DATELINKED;
    private String LINKCHEKER;
    private String DATELINKCHEKED;
    private boolean ACTIVE;
    private String LINKCHEKERREMARKS;
    private boolean LINKED;
    private boolean TRIALS;
    private boolean LOGGEDIN;
    private boolean FIRSTLOGIN;
    private String PINMAKER;
    private boolean RESETPIN;
    private String RESETBY;
    private String RESETON;
    private String RESETDATE;
    private String USSDIMSI;
    private boolean DELINKED;
    private Date DELINKEDON;
    private String DELINKEDBY;
    private boolean DELINKAPPROVED;
    private Date DELINKAPPROVEDON;
    private String DELINKAPPROVEDBY;
    private String LANG;
    private boolean BLOCKED;
    private String BLOCKEDBY;
    private Date BLOCKEDON;
    private String BLOCKEDREASON;
    private boolean UNBLOCKED;
    private String UNBLOCKEDBY;
    private Date UNBLOCKEDON;
    private String UNBLOCKEDREASON;
    private boolean DORMANT;
    private Date LASTWORKINGDATE;

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer value) {
        this.ID = value;
    }

    public String getDEVICEIMEI() {
        return this.DEVICEIMEI;
    }

    public void setDEVICEIMEI(String value) {
        this.DEVICEIMEI = value;
    }

    public String getDEVICEMOBILENUMBER() {
        return this.DEVICEMOBILENUMBER;
    }

    public void setDEVICEMOBILENUMBER(String value) {
        this.DEVICEMOBILENUMBER = value;
    }

    public String getAGENTID() {
        return this.AGENTID;
    }

    public void setAGENTID(String value) {
        this.AGENTID = value;
    }

    public String getCREATEDBY() {
        return this.CREATEDBY;
    }

    public void setCREATEDBY(String value) {
        this.CREATEDBY = value;
    }

    public Date getCREATEDON() {
        return this.CREATEDON;
    }

    public void setCREATEDON(Date value) {
        this.CREATEDON = value;
    }

    public Integer getAPPROVED() {
        return this.APPROVED;
    }

    public void setAPPROVED(Integer value) {
        this.APPROVED = value;
    }

    public String getAPPROVEDBY() {
        return this.APPROVEDBY;
    }

    public void setAPPROVEDBY(String value) {
        this.APPROVEDBY = value;
    }

    public Date getAPPROVEDON() {
        return this.APPROVEDON;
    }

    public void setAPPROVEDON(Date value) {
        this.APPROVEDON = value;
    }

    public Integer getREWORKED() {
        return this.REWORKED;
    }

    public void setREWORKED(Integer value) {
        this.REWORKED = value;
    }

    public Date getREWORKEDON() {
        return this.REWORKEDON;
    }

    public void setREWORKEDON(Date value) {
        this.REWORKEDON = value;
    }

    public String getREWORKEDBY() {
        return this.REWORKEDBY;
    }

    public void setREWORKEDBY(String value) {
        this.REWORKEDBY = value;
    }

    public String getREWORKREMARKS() {
        return this.REWORKREMARKS;
    }

    public void setREWORKREMARKS(String value) {
        this.REWORKREMARKS = value;
    }

    public boolean getASSIGNED() {
        return this.ASSIGNED;
    }

    public void setASSIGNED(boolean value) {
        this.ASSIGNED = value;
    }

    public boolean getDECLINED() {
        return this.DECLINED;
    }

    public void setDECLINED(boolean value) {
        this.DECLINED = value;
    }

    public String getDECLINEDON() {
        return this.DECLINEDON;
    }

    public void setDECLINEDON(String value) {
        this.DECLINEDON = value;
    }

    public String getDECLINEDBY() {
        return this.DECLINEDBY;
    }

    public void setDECLINEDBY(String value) {
        this.DECLINEDBY = value;
    }

    public boolean getDELETED() {
        return this.DELETED;
    }

    public void setDELETED(boolean value) {
        this.DELETED = value;
    }

    public String getDELETEDBY() {
        return this.DELETEDBY;
    }

    public void setDELETEDBY(String value) {
        this.DELETEDBY = value;
    }

    public Date getDELETEDON() {
        return this.DELETEDON;
    }

    public void setDELETEDON(Date value) {
        this.DELETEDON = value;
    }

    public String getAGENTIDNUMBER() {
        return this.AGENTIDNUMBER;
    }

    public void setAGENTIDNUMBER(String value) {
        this.AGENTIDNUMBER = value;
    }

    public String getREMARKS() {
        return this.REMARKS;
    }

    public void setREMARKS(String value) {
        this.REMARKS = value;
    }

    public String getCHECKERREMARKS() {
        return this.CHECKERREMARKS;
    }

    public void setCHECKERREMARKS(String value) {
        this.CHECKERREMARKS = value;
    }

    public String getDEVICETYPE() {
        return this.DEVICETYPE;
    }

    public void setDEVICETYPE(String value) {
        this.DEVICETYPE = value;
    }

    public String getPIN() {
        return this.PIN;
    }

    public void setPIN(String value) {
        this.PIN = value;
    }

    public String getLINKMAKER() {
        return this.LINKMAKER;
    }

    public void setLINKMAKER(String value) {
        this.LINKMAKER = value;
    }

    public boolean getLINKAPPROVED() {
        return this.LINKAPPROVED;
    }

    public void setLINKAPPROVED(boolean value) {
        this.LINKAPPROVED = value;
    }

    public String getAGENTNAMES() {
        return this.AGENTNAMES;
    }

    public void setAGENTNAMES(String value) {
        this.AGENTNAMES = value;
    }

    public Timestamp getDATELINKED() {
        return this.DATELINKED;
    }

    public void setDATELINKED(Timestamp value) {
        this.DATELINKED = value;
    }

    public String getLINKCHEKER() {
        return this.LINKCHEKER;
    }

    public void setLINKCHEKER(String value) {
        this.LINKCHEKER = value;
    }

    public String getDATELINKCHEKED() {
        return this.DATELINKCHEKED;
    }

    public void setDATELINKCHEKED(String value) {
        this.DATELINKCHEKED = value;
    }

    public boolean getACTIVE() {
        return this.ACTIVE;
    }

    public void setACTIVE(boolean value) {
        this.ACTIVE = value;
    }

    public String getLINKCHEKERREMARKS() {
        return this.LINKCHEKERREMARKS;
    }

    public void setLINKCHEKERREMARKS(String value) {
        this.LINKCHEKERREMARKS = value;
    }

    public boolean getLINKED() {
        return this.LINKED;
    }

    public void setLINKED(boolean value) {
        this.LINKED = value;
    }

    public boolean getTRIALS() {
        return this.TRIALS;
    }

    public void setTRIALS(boolean value) {
        this.TRIALS = value;
    }

    public boolean getLOGGEDIN() {
        return this.LOGGEDIN;
    }

    public void setLOGGEDIN(boolean value) {
        this.LOGGEDIN = value;
    }

    public boolean getFIRSTLOGIN() {
        return this.FIRSTLOGIN;
    }

    public void setFIRSTLOGIN(boolean value) {
        this.FIRSTLOGIN = value;
    }

    public String getPINMAKER() {
        return this.PINMAKER;
    }

    public void setPINMAKER(String value) {
        this.PINMAKER = value;
    }

    public boolean getRESETPIN() {
        return this.RESETPIN;
    }

    public void setRESETPIN(boolean value) {
        this.RESETPIN = value;
    }

    public String getRESETBY() {
        return this.RESETBY;
    }

    public void setRESETBY(String value) {
        this.RESETBY = value;
    }

    public String getRESETON() {
        return this.RESETON;
    }

    public void setRESETON(String value) {
        this.RESETON = value;
    }

    public String getRESETDATE() {
        return this.RESETDATE;
    }

    public void setRESETDATE(String value) {
        this.RESETDATE = value;
    }

    public String getUSSDIMSI() {
        return this.USSDIMSI;
    }

    public void setUSSDIMSI(String value) {
        this.USSDIMSI = value;
    }

    public boolean getDELINKED() {
        return this.DELINKED;
    }

    public void setDELINKED(boolean value) {
        this.DELINKED = value;
    }

    public Date getDELINKEDON() {
        return this.DELINKEDON;
    }

    public void setDELINKEDON(Date value) {
        this.DELINKEDON = value;
    }

    public String getDELINKEDBY() {
        return this.DELINKEDBY;
    }

    public void setDELINKEDBY(String value) {
        this.DELINKEDBY = value;
    }

    public boolean getDELINKAPPROVED() {
        return this.DELINKAPPROVED;
    }

    public void setDELINKAPPROVED(boolean value) {
        this.DELINKAPPROVED = value;
    }

    public Date getDELINKAPPROVEDON() {
        return this.DELINKAPPROVEDON;
    }

    public void setDELINKAPPROVEDON(Date value) {
        this.DELINKAPPROVEDON = value;
    }

    public String getDELINKAPPROVEDBY() {
        return this.DELINKAPPROVEDBY;
    }

    public void setDELINKAPPROVEDBY(String value) {
        this.DELINKAPPROVEDBY = value;
    }

    public String getLANG() {
        return this.LANG;
    }

    public void setLANG(String value) {
        this.LANG = value;
    }

    public boolean getBLOCKED() {
        return this.BLOCKED;
    }

    public void setBLOCKED(boolean value) {
        this.BLOCKED = value;
    }

    public String getBLOCKEDBY() {
        return this.BLOCKEDBY;
    }

    public void setBLOCKEDBY(String value) {
        this.BLOCKEDBY = value;
    }

    public Date getBLOCKEDON() {
        return this.BLOCKEDON;
    }

    public void setBLOCKEDON(Date value) {
        this.BLOCKEDON = value;
    }

    public String getBLOCKEDREASON() {
        return this.BLOCKEDREASON;
    }

    public void setBLOCKEDREASON(String value) {
        this.BLOCKEDREASON = value;
    }

    public boolean getUNBLOCKED() {
        return this.UNBLOCKED;
    }

    public void setUNBLOCKED(boolean value) {
        this.UNBLOCKED = value;
    }

    public String getUNBLOCKEDBY() {
        return this.UNBLOCKEDBY;
    }

    public void setUNBLOCKEDBY(String value) {
        this.UNBLOCKEDBY = value;
    }

    public Date getUNBLOCKEDON() {
        return this.UNBLOCKEDON;
    }

    public void setUNBLOCKEDON(Date value) {
        this.UNBLOCKEDON = value;
    }

    public String getUNBLOCKEDREASON() {
        return this.UNBLOCKEDREASON;
    }

    public void setUNBLOCKEDREASON(String value) {
        this.UNBLOCKEDREASON = value;
    }

    public boolean getDORMANT() {
        return this.DORMANT;
    }

    public void setDORMANT(boolean value) {
        this.DORMANT = value;
    }

    public Date getLASTWORKINGDATE() {
        return this.LASTWORKINGDATE;
    }

    public void setLASTWORKINGDATE(Date value) {
        this.LASTWORKINGDATE = value;
    }


}
