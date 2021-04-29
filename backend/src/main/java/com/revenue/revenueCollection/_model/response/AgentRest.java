package com.revenue.revenueCollection._model.response;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

public class AgentRest {

    private Long agentid;

    private String agentnames;
    private Date dob;
    private String gender;
    private String commissionaccount;
    private BigDecimal limit;

    private Boolean approved;
    private String email;
    private Integer idtype;
    private String idnumber;
    private String businessmobile;
    private String county;
    private String subcounty;
    private String ward;
    private String idback;
    private String idfront;
    private String formimage;
    private Boolean dormant;
    private Date lastworkingdate;
    private Boolean rejected;
    private Boolean deleted;
    private String remarks;
    private String checkerremark;
    private BigDecimal id;
    private String firstname;
    private String secondname;
    private String lastname;
    private String customerno;
    private Timestamp makerdate;
    private String maker;
    private String checker;
    private Date checkerdate;
    private String deletedby;
    private Boolean reworked;
    private String reworkedby;
    private String reworkremarks;
    private Date reworkedon;
    private Boolean firstlogin;
    private Date deletedon;
    private String checkerremarks;
    private String idmode;
    private Boolean deviceattached;
    private Boolean linked;
    private String linkmaker;
    private Timestamp datelinked;
    private Boolean linkapproved;
    private String linkcheker;
    private String datelinkcheked;
    private String linkchekerremarks;
    private Boolean resetpin;
    private String pinmaker;
    private String pinmakerremarks;
    private String datepinreq;
    private String usertype;
    private BigDecimal active;
    private String resetby;
    private Date resetdate;
    private Integer agenttype;
    private Integer trials;

    private Boolean loggedin;

    private String lastlogin;

    private Timestamp lastlogout;

    private Boolean deactivate;

    public Long getagentid() {
        return this.agentid;
    }

    public void setagentid(Long value) {
        this.agentid = value;
    }

    public String getagentnames() {
        return this.agentnames;
    }

    public void setagentnames(String value) {
        this.agentnames = value;
    }

    public Date getdob() {
        return this.dob;
    }

    public void setdob(Date value) {
        this.dob = value;
    }

    public String getgender() {
        return this.gender;
    }

    public void setgender(String value) {
        this.gender = value;
    }

    public String getcommissionaccount() {
        return this.commissionaccount;
    }

    public void setcommissionaccount(String value) {
        this.commissionaccount = value;
    }

    public BigDecimal getlimit() {
        return this.limit;
    }

    public void setlimit(BigDecimal value) {
        this.limit = value;
    }

    public Boolean getapproved() {
        return this.approved;
    }

    public void setapproved(Boolean value) {
        this.approved = value;
    }

    public String getemail() {
        return this.email;
    }

    public void setemail(String value) {
        this.email = value;
    }

    public Integer getidtype() {
        return this.idtype;
    }

    public void setidtype(Integer value) {
        this.idtype = value;
    }

    public String getidnumber() {
        return this.idnumber;
    }

    public void setidnumber(String value) {
        this.idnumber = value;
    }

    public String getbusinessmobile() {
        return this.businessmobile;
    }

    public void setbusinessmobile(String value) {
        this.businessmobile = value;
    }

    public String getcounty() {
        return this.county;
    }

    public void setcounty(String value) {
        this.county = value;
    }

    public String getsubcounty() {
        return this.subcounty;
    }

    public void setsubcounty(String value) {
        this.subcounty = value;
    }

    public String getward() {
        return this.ward;
    }

    public void setward(String value) {
        this.ward = value;
    }

    public String getidback() {
        return this.idback;
    }

    public void setidback(String value) {
        this.idback = value;
    }

    public String getidfront() {
        return this.idfront;
    }

    public void setidfront(String value) {
        this.idfront = value;
    }

    public String getformimage() {
        return this.formimage;
    }

    public void setformimage(String value) {
        this.formimage = value;
    }

    public Boolean getdormant() {
        return this.dormant;
    }

    public void setdormant(Boolean value) {
        this.dormant = value;
    }

    public Date getlastworkingdate() {
        return this.lastworkingdate;
    }

    public void setlastworkingdate(Date value) {
        this.lastworkingdate = value;
    }

    public Boolean getrejected() {
        return this.rejected;
    }

    public void setrejected(Boolean value) {
        this.rejected = value;
    }

    public Boolean getdeleted() {
        return this.deleted;
    }

    public void setdeleted(Boolean value) {
        this.deleted = value;
    }

    public String getremarks() {
        return this.remarks;
    }

    public void setremarks(String value) {
        this.remarks = value;
    }

    public String getcheckerremark() {
        return this.checkerremark;
    }

    public void setcheckerremark(String value) {
        this.checkerremark = value;
    }

    public BigDecimal getid() {
        return this.id;
    }

    public void setid(BigDecimal value) {
        this.id = value;
    }

    public String getfirstname() {
        return this.firstname;
    }

    public void setfirstname(String value) {
        this.firstname = value;
    }

    public String getsecondname() {
        return this.secondname;
    }

    public void setsecondname(String value) {
        this.secondname = value;
    }

    public String getlastname() {
        return this.lastname;
    }

    public void setlastname(String value) {
        this.lastname = value;
    }

    public String getcustomerno() {
        return this.customerno;
    }

    public void setcustomerno(String value) {
        this.customerno = value;
    }

    public Timestamp getmakerdate() {
        return this.makerdate;
    }

    public void setmakerdate(Timestamp value) {
        this.makerdate = value;
    }

    public String getmaker() {
        return this.maker;
    }

    public void setmaker(String value) {
        this.maker = value;
    }

    public String getchecker() {
        return this.checker;
    }

    public void setchecker(String value) {
        this.checker = value;
    }

    public Date getcheckerdate() {
        return this.checkerdate;
    }

    public void setcheckerdate(Date value) {
        this.checkerdate = value;
    }

    public String getdeletedby() {
        return this.deletedby;
    }

    public void setdeletedby(String value) {
        this.deletedby = value;
    }

    public Boolean getreworked() {
        return this.reworked;
    }

    public void setreworked(Boolean value) {
        this.reworked = value;
    }

    public String getreworkedby() {
        return this.reworkedby;
    }

    public void setreworkedby(String value) {
        this.reworkedby = value;
    }

    public String getreworkremarks() {
        return this.reworkremarks;
    }

    public void setreworkremarks(String value) {
        this.reworkremarks = value;
    }

    public Date getreworkedon() {
        return this.reworkedon;
    }

    public void setreworkedon(Date value) {
        this.reworkedon = value;
    }

    public Boolean getfirstlogin() {
        return this.firstlogin;
    }

    public void setfirstlogin(Boolean value) {
        this.firstlogin = value;
    }

    public Date getdeletedon() {
        return this.deletedon;
    }

    public void setdeletedon(Date value) {
        this.deletedon = value;
    }

    public String getcheckerremarks() { return this.checkerremarks;}

    public void setcheckerremarks(String value) {
        this.checkerremarks = value;
    }

    public String getidmode() {
        return this.idmode;
    }

    public void setidmode(String value) {
        this.idmode = value;
    }

    public Boolean getdeviceattached() {
        return this.deviceattached;
    }

    public void setdeviceattached(Boolean value) {
        this.deviceattached = value;
    }

    public Boolean getlinked() {
        return this.linked;
    }

    public void setlinked(Boolean value) {
        this.linked = value;
    }

    public String getlinkmaker() {
        return this.linkmaker;
    }

    public void setlinkmaker(String value) {
        this.linkmaker = value;
    }

    public Timestamp getdatelinked() {
        return this.datelinked;
    }

    public void setdatelinked(Timestamp value) {
        this.datelinked = value;
    }

    public Boolean getlinkapproved() {
        return this.linkapproved;
    }

    public void setlinkapproved(Boolean value) {
        this.linkapproved = value;
    }

    public String getlinkcheker() {
        return this.linkcheker;
    }

    public void setlinkcheker(String value) {
        this.linkcheker = value;
    }

    public String getdatelinkcheked() {
        return this.datelinkcheked;
    }

    public void setdatelinkcheked(String value) {
        this.datelinkcheked = value;
    }

    public String getlinkchekerremarks() {
        return this.linkchekerremarks;
    }

    public void setlinkchekerremarks(String value) {
        this.linkchekerremarks = value;
    }

    public Boolean getresetpin() {
        return this.resetpin;
    }

    public void setresetpin(Boolean value) {
        this.resetpin = value;
    }

    public String getpinmaker() {
        return this.pinmaker;
    }

    public void setpinmaker(String value) {
        this.pinmaker = value;
    }

    public String getpinmakerremarks() {
        return this.pinmakerremarks;
    }

    public void setpinmakerremarks(String value) {
        this.pinmakerremarks = value;
    }

    public String getdatepinreq() {
        return this.datepinreq;
    }

    public void setdatepinreq(String value) {
        this.datepinreq = value;
    }

    public String getusertype() {
        return this.usertype;
    }

    public void setusertype(String value) {
        this.usertype = value;
    }

    public BigDecimal getactive() {
        return this.active;
    }

    public void setactive(BigDecimal value) {
        this.active = value;
    }

    public String getresetby() {
        return this.resetby;
    }

    public void setresetby(String value) {
        this.resetby = value;
    }

    public Date getresetdate() {
        return this.resetdate;
    }

    public void setresetdate(Date value) {
        this.resetdate = value;
    }

    public Integer getagenttype() {
        return this.agenttype;
    }

    public void setagenttype(Integer value) {
        this.agenttype = value;
    }

    public Integer gettrials() {
        return this.trials;
    }

    public void settrials(Integer value) {
        this.trials = value;
    }

    public Boolean getloggedin() {
        return this.loggedin;
    }

    public void setloggedin(Boolean value) {
        this.loggedin = value;
    }

    public String getlastlogin() {
        return this.lastlogin;
    }

    public void setlastlogin(String value) {
        this.lastlogin = value;
    }

    public Timestamp getlastlogout() {
        return this.lastlogout;
    }

    public void setlastlogout(Timestamp value) {
        this.lastlogout = value;
    }

    public Boolean getdeactivate() {
        return this.deactivate;
    }

    public void setdeactivate(Boolean value) {
        this.deactivate = value;
    }

}

