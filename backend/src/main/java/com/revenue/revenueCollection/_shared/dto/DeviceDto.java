package com.revenue.revenueCollection._shared.dto;

import javafx.beans.binding.BooleanExpression;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class DeviceDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long deviceid;
    private String deviceimei;
    private String devicemobilenumber;
    private String agentid;
    private String createdby;
    private Timestamp createdon;
    private Boolean approved;
    private String approvedby;
    private Timestamp approvedon;
    private Integer reworked;
    private Timestamp reworkedon;
    private String reworkedby;
    private String reworkremarks;
    private Boolean assigned;
    private Boolean declined;
    private Timestamp declinedon;
    private String declinedby;
    private Boolean deleted;
    private String deletedby;
    private Timestamp deletedon;
    private String agentidnumber;
    private String remarks;
    private String checkerremarks;
    private String devicetype;
    private String pin;
    private String linkmaker;
    private Boolean linkapproved;
    private String agentnames;
    private Timestamp datelinked;
    private String linkcheker;
    private String datelinkcheked;
    private Boolean active;
    private String linkchekerremarks;
    private Boolean linked;
    private Boolean trials;
    private Boolean loggedin;
    private Boolean firstlogin;
    private String pinmaker;
    private Boolean resetpin;
    private String resetby;
    private String reseton;
    private String resetdate;
    private String ussdimsi;
    private Boolean delinked;
    private Timestamp delinkedon;
    private String delinkedby;
    private Boolean delinkapproved;
    private Timestamp delinkapprovedon;
    private String delinkapprovedby;
    private String lang;
    private Boolean blocked;
    private String blockedby;
    private Timestamp blockedon;
    private String blockedreason;
    private Boolean unblocked;
    private String unblockedby;
    private Timestamp unblockedon;
    private String unblockedreason;
    private Boolean dormant;
    private Date lastworkingdate;


    public Long getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(Long deviceid) {
        this.deviceid = deviceid;
    }

    public String getDeviceimei() {
        return deviceimei;
    }

    public void setDeviceimei(String deviceimei) {
        this.deviceimei = deviceimei;
    }

    public String getDevicemobilenumber() {
        return devicemobilenumber;
    }

    public void setDevicemobilenumber(String devicemobilenumber) {
        this.devicemobilenumber = devicemobilenumber;
    }

    public String getAgentid() {
        return agentid;
    }

    public void setAgentid(String agentid) {
        this.agentid = agentid;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Timestamp getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Timestamp createdon) {
        this.createdon = createdon;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public String getApprovedby() {
        return approvedby;
    }

    public void setApprovedby(String approvedby) {
        this.approvedby = approvedby;
    }

    public Timestamp getApprovedon() {
        return approvedon;
    }

    public void setApprovedon(Timestamp approvedon) {
        this.approvedon = approvedon;
    }

    public Integer getReworked() {
        return reworked;
    }

    public void setReworked(Integer reworked) {
        this.reworked = reworked;
    }

    public Timestamp getReworkedon() {
        return reworkedon;
    }

    public void setReworkedon(Timestamp reworkedon) {
        this.reworkedon = reworkedon;
    }

    public String getReworkedby() {
        return reworkedby;
    }

    public void setReworkedby(String reworkedby) {
        this.reworkedby = reworkedby;
    }

    public String getReworkremarks() {
        return reworkremarks;
    }

    public void setReworkremarks(String reworkremarks) {
        this.reworkremarks = reworkremarks;
    }

    public Boolean getAssigned() {
        return assigned;
    }

    public void setAssigned(Boolean assigned) {
        this.assigned = assigned;
    }

    public Boolean getDeclined() {
        return declined;
    }

    public void setDeclined(Boolean declined) {
        this.declined = declined;
    }

    public Timestamp getDeclinedon() {
        return declinedon;
    }

    public void setDeclinedon(Timestamp declinedon) {
        this.declinedon = declinedon;
    }

    public String getDeclinedby() {
        return declinedby;
    }

    public void setDeclinedby(String declinedby) {
        this.declinedby = declinedby;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getDeletedby() {
        return deletedby;
    }

    public void setDeletedby(String deletedby) {
        this.deletedby = deletedby;
    }

    public Timestamp getDeletedon() {
        return deletedon;
    }

    public void setDeletedon(Timestamp deletedon) {
        this.deletedon = deletedon;
    }

    public String getAgentidnumber() {
        return agentidnumber;
    }

    public void setAgentidnumber(String agentidnumber) {
        this.agentidnumber = agentidnumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getCheckerremarks() {
        return checkerremarks;
    }

    public void setCheckerremarks(String checkerremarks) {
        this.checkerremarks = checkerremarks;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getLinkmaker() {
        return linkmaker;
    }

    public void setLinkmaker(String linkmaker) {
        this.linkmaker = linkmaker;
    }

    public Boolean getLinkapproved() {
        return linkapproved;
    }

    public void setLinkapproved(Boolean linkapproved) {
        this.linkapproved = linkapproved;
    }

    public String getAgentnames() {
        return agentnames;
    }

    public void setAgentnames(String agentnames) {
        this.agentnames = agentnames;
    }

    public Timestamp getDatelinked() {
        return datelinked;
    }

    public void setDatelinked(Timestamp datelinked) {
        this.datelinked = datelinked;
    }

    public String getLinkcheker() {
        return linkcheker;
    }

    public void setLinkcheker(String linkcheker) {
        this.linkcheker = linkcheker;
    }

    public String getDatelinkcheked() {
        return datelinkcheked;
    }

    public void setDatelinkcheked(String datelinkcheked) {
        this.datelinkcheked = datelinkcheked;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getLinkchekerremarks() {
        return linkchekerremarks;
    }

    public void setLinkchekerremarks(String linkchekerremarks) {
        this.linkchekerremarks = linkchekerremarks;
    }

    public Boolean getLinked() {
        return linked;
    }

    public void setLinked(Boolean linked) {
        this.linked = linked;
    }

    public Boolean getTrials() {
        return trials;
    }

    public void setTrials(Boolean trials) {
        this.trials = trials;
    }

    public Boolean getLoggedin() {
        return loggedin;
    }

    public void setLoggedin(Boolean loggedin) {
        this.loggedin = loggedin;
    }

    public Boolean getFirstlogin() {
        return firstlogin;
    }

    public void setFirstlogin(Boolean firstlogin) {
        this.firstlogin = firstlogin;
    }

    public String getPinmaker() {
        return pinmaker;
    }

    public void setPinmaker(String pinmaker) {
        this.pinmaker = pinmaker;
    }

    public Boolean getResetpin() {
        return resetpin;
    }

    public void setResetpin(Boolean resetpin) {
        this.resetpin = resetpin;
    }

    public String getResetby() {
        return resetby;
    }

    public void setResetby(String resetby) {
        this.resetby = resetby;
    }

    public String getReseton() {
        return reseton;
    }

    public void setReseton(String reseton) {
        this.reseton = reseton;
    }

    public String getResetdate() {
        return resetdate;
    }

    public void setResetdate(String resetdate) {
        this.resetdate = resetdate;
    }

    public String getUssdimsi() {
        return ussdimsi;
    }

    public void setUssdimsi(String ussdimsi) {
        this.ussdimsi = ussdimsi;
    }

    public Boolean getDelinked() {
        return delinked;
    }

    public void setDelinked(Boolean delinked) {
        this.delinked = delinked;
    }

    public Timestamp getDelinkedon() {
        return delinkedon;
    }

    public void setDelinkedon(Timestamp delinkedon) {
        this.delinkedon = delinkedon;
    }

    public String getDelinkedby() {
        return delinkedby;
    }

    public void setDelinkedby(String delinkedby) {
        this.delinkedby = delinkedby;
    }

    public Boolean getDelinkapproved() {
        return delinkapproved;
    }

    public void setDelinkapproved(Boolean delinkapproved) {
        this.delinkapproved = delinkapproved;
    }

    public Timestamp getDelinkapprovedon() {
        return delinkapprovedon;
    }

    public void setDelinkapprovedon(Timestamp delinkapprovedon) {
        this.delinkapprovedon = delinkapprovedon;
    }

    public String getDelinkapprovedby() {
        return delinkapprovedby;
    }

    public void setDelinkapprovedby(String delinkapprovedby) {
        this.delinkapprovedby = delinkapprovedby;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getBlocked() {
        return blocked;
    }

    public void setBlocked(Boolean blocked) {
        this.blocked = blocked;
    }

    public String getBlockedby() {
        return blockedby;
    }

    public void setBlockedby(String blockedby) {
        this.blockedby = blockedby;
    }

    public Timestamp getBlockedon() {
        return blockedon;
    }

    public void setBlockedon(Timestamp blockedon) {
        this.blockedon = blockedon;
    }

    public String getBlockedreason() {
        return blockedreason;
    }

    public void setBlockedreason(String blockedreason) {
        this.blockedreason = blockedreason;
    }

    public Boolean getUnblocked() {
        return unblocked;
    }

    public void setUnblocked(Boolean unblocked) {
        this.unblocked = unblocked;
    }

    public String getUnblockedby() {
        return unblockedby;
    }

    public void setUnblockedby(String unblockedby) {
        this.unblockedby = unblockedby;
    }

    public Timestamp getUnblockedon() {
        return unblockedon;
    }

    public void setUnblockedon(Timestamp unblockedon) {
        this.unblockedon = unblockedon;
    }

    public String getUnblockedreason() {
        return unblockedreason;
    }

    public void setUnblockedreason(String unblockedreason) {
        this.unblockedreason = unblockedreason;
    }

    public Boolean getDormant() {
        return dormant;
    }

    public void setDormant(Boolean dormant) {
        this.dormant = dormant;
    }

    public Date getLastworkingdate() {
        return lastworkingdate;
    }

    public void setLastworkingdate(Date lastworkingdate) {
        this.lastworkingdate = lastworkingdate;
    }


    @Override
    public String toString() {
        return "DeviceDto{" +
                "deviceimei='" + deviceimei + '\'' +
                ", devicemobilenumber='" + devicemobilenumber + '\'' +
                ", agentid='" + agentid + '\'' +
                ", createdby='" + createdby + '\'' +
                ", createdon=" + createdon +
                ", approved=" + approved +
                ", approvedby='" + approvedby + '\'' +
                ", approvedon=" + approvedon +
                ", reworked=" + reworked +
                ", reworkedon=" + reworkedon +
                ", reworkedby='" + reworkedby + '\'' +
                ", reworkremarks='" + reworkremarks + '\'' +
                ", assigned=" + assigned +
                ", declined=" + declined +
                ", declinedon=" + declinedon +
                ", declinedby='" + declinedby + '\'' +
                ", deleted=" + deleted +
                ", deletedby='" + deletedby + '\'' +
                ", deletedon=" + deletedon +
                ", agentidnumber='" + agentidnumber + '\'' +
                ", remarks='" + remarks + '\'' +
                ", checkerremarks='" + checkerremarks + '\'' +
                ", devicetype='" + devicetype + '\'' +
                ", pin='" + pin + '\'' +
                ", linkmaker='" + linkmaker + '\'' +
                ", linkapproved=" + linkapproved +
                ", agentnames='" + agentnames + '\'' +
                ", datelinked=" + datelinked +
                ", linkcheker='" + linkcheker + '\'' +
                ", datelinkcheked='" + datelinkcheked + '\'' +
                ", active=" + active +
                ", linkchekerremarks='" + linkchekerremarks + '\'' +
                ", linked=" + linked +
                ", trials=" + trials +
                ", loggedin=" + loggedin +
                ", firstlogin=" + firstlogin +
                ", pinmaker='" + pinmaker + '\'' +
                ", resetpin=" + resetpin +
                ", resetby='" + resetby + '\'' +
                ", reseton='" + reseton + '\'' +
                ", resetdate='" + resetdate + '\'' +
                ", ussdimsi='" + ussdimsi + '\'' +
                ", delinked=" + delinked +
                ", delinkedon=" + delinkedon +
                ", delinkedby='" + delinkedby + '\'' +
                ", delinkapproved=" + delinkapproved +
                ", delinkapprovedon=" + delinkapprovedon +
                ", delinkapprovedby='" + delinkapprovedby + '\'' +
                ", lang='" + lang + '\'' +
                ", blocked=" + blocked +
                ", blockedby='" + blockedby + '\'' +
                ", blockedon=" + blockedon +
                ", blockedreason='" + blockedreason + '\'' +
                ", unblocked=" + unblocked +
                ", unblockedby='" + unblockedby + '\'' +
                ", unblockedon=" + unblockedon +
                ", unblockedreason='" + unblockedreason + '\'' +
                ", dormant=" + dormant +
                ", lastworkingdate=" + lastworkingdate +
                '}';
    }
}
