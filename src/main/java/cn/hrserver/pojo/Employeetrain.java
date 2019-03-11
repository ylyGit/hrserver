package cn.hrserver.pojo;


public class Employeetrain {

  private long id;
  private long eid;
  private java.sql.Date trainDate;
  private String trainContent;
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


  public java.sql.Date getTrainDate() {
    return trainDate;
  }

  public void setTrainDate(java.sql.Date trainDate) {
    this.trainDate = trainDate;
  }


  public String getTrainContent() {
    return trainContent;
  }

  public void setTrainContent(String trainContent) {
    this.trainContent = trainContent;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
