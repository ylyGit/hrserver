package cn.hrserver.pojo;


public class Employeeremove {

  private long id;
  private long eid;
  private long afterDepId;
  private long afterJobId;
  private java.sql.Date removeDate;
  private String reason;
  private String remark;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getEid() {
    return eid;
  }

  public void setEid(long eid) {
    this.eid = eid;
  }


  public long getAfterDepId() {
    return afterDepId;
  }

  public void setAfterDepId(long afterDepId) {
    this.afterDepId = afterDepId;
  }


  public long getAfterJobId() {
    return afterJobId;
  }

  public void setAfterJobId(long afterJobId) {
    this.afterJobId = afterJobId;
  }


  public java.sql.Date getRemoveDate() {
    return removeDate;
  }

  public void setRemoveDate(java.sql.Date removeDate) {
    this.removeDate = removeDate;
  }


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
