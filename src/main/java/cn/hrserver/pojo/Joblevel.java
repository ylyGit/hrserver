package cn.hrserver.pojo;


public class Joblevel {

  private long id;
  private String name;
  private String titleLevel;
  private java.sql.Timestamp createDate;
  private long enabled;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getTitleLevel() {
    return titleLevel;
  }

  public void setTitleLevel(String titleLevel) {
    this.titleLevel = titleLevel;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }

}
