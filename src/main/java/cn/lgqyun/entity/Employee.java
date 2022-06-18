package cn.lgqyun.entity;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Employee {

  private Integer id;
  private String name;
  private double salary;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date birthday;
  private String photo;

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

}
