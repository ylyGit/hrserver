package cn.hrserver.pojo;


public class Employeeec {

  private long id;
  private long eid;
  private java.sql.Date ecDate;
  private String ecReason;
  private long ecPoint;
  private long ecType;
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


  public java.sql.Date getEcDate() {
    return ecDate;
  }

  public void setEcDate(java.sql.Date ecDate) {
    this.ecDate = ecDate;
  }


  public String getEcReason() {
    return ecReason;
  }

  public void setEcReason(String ecReason) {
    this.ecReason = ecReason;
  }


  public long getEcPoint() {
    return ecPoint;
  }

  public void setEcPoint(long ecPoint) {
    this.ecPoint = ecPoint;
  }


  public long getEcType() {
    return ecType;
  }

  public void setEcType(long ecType) {
    this.ecType = ecType;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
