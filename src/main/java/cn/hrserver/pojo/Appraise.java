package cn.hrserver.pojo;


public class Appraise {

  private long id;
  private long eid;
  private java.sql.Date appDate;
  private String appResult;
  private String appContent;
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


  public java.sql.Date getAppDate() {
    return appDate;
  }

  public void setAppDate(java.sql.Date appDate) {
    this.appDate = appDate;
  }


  public String getAppResult() {
    return appResult;
  }

  public void setAppResult(String appResult) {
    this.appResult = appResult;
  }


  public String getAppContent() {
    return appContent;
  }

  public void setAppContent(String appContent) {
    this.appContent = appContent;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
