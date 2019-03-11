package cn.hrserver.pojo;


import java.util.List;

public class Menu {

  private long id;
  private String url;
  private String path;
  private String component;
  private String name;
  private String iconCls;
  private long keepAlive;
  private long requireAuth;
  private long parentId;
  private long enabled;
  private List<Role> roles;

  public List<Role> getRoles() {
    return roles;
  }

  public void setRoles(List<Role> roles) {
    this.roles = roles;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  public String getComponent() {
    return component;
  }

  public void setComponent(String component) {
    this.component = component;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getIconCls() {
    return iconCls;
  }

  public void setIconCls(String iconCls) {
    this.iconCls = iconCls;
  }


  public long getKeepAlive() {
    return keepAlive;
  }

  public void setKeepAlive(long keepAlive) {
    this.keepAlive = keepAlive;
  }


  public long getRequireAuth() {
    return requireAuth;
  }

  public void setRequireAuth(long requireAuth) {
    this.requireAuth = requireAuth;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getEnabled() {
    return enabled;
  }

  public void setEnabled(long enabled) {
    this.enabled = enabled;
  }

}
