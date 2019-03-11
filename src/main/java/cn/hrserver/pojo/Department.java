package cn.hrserver.pojo;


public class Department {

  private long id;
  private String name;
  private long parentId;
  private String depPath;
  private long enabled;
  private long isParent;


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


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getDepPath() {
    return depPath;
  }

  public void setDepPath(String depPath) {
    this.depPath = depPath;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }


  public long getIsParent() {
    return isParent;
  }

  public void setIsParent(long isParent) {
    this.isParent = isParent;
  }

}
