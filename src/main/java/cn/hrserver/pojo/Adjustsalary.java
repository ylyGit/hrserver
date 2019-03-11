package cn.hrserver.pojo;


public class Adjustsalary {

  private long id;
  private long eid;
  private java.sql.Date asDate;
  private long beforeSalary;
  private long afterSalary;
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


  public java.sql.Date getAsDate() {
    return asDate;
  }

  public void setAsDate(java.sql.Date asDate) {
    this.asDate = asDate;
  }


  public long getBeforeSalary() {
    return beforeSalary;
  }

  public void setBeforeSalary(long beforeSalary) {
    this.beforeSalary = beforeSalary;
  }


  public long getAfterSalary() {
    return afterSalary;
  }

  public void setAfterSalary(long afterSalary) {
    this.afterSalary = afterSalary;
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
