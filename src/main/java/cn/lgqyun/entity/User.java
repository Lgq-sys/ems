package cn.lgqyun.entity;


public class User {

  private long id;
  private String username;
  private String realname;
  private String password;
  private long gender;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }

}
