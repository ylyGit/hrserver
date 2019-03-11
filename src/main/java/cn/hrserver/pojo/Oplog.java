package cn.hrserver.pojo;


public class Oplog {

  private long id;
  private java.sql.Date addDate;
  private String operate;
  private long hrid;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public java.sql.Date getAddDate() {
    return addDate;
  }

  public void setAddDate(java.sql.Date addDate) {
    this.addDate = addDate;
  }


  public String getOperate() {
    return operate;
  }

  public void setOperate(String operate) {
    this.operate = operate;
  }


  public long getHrid() {
    return hrid;
  }

  public void setHrid(long hrid) {
    this.hrid = hrid;
  }

}
