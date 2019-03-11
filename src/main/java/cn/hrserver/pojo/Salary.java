package cn.hrserver.pojo;


public class Salary {

  private long id;
  private long basicSalary;
  private long bonus;
  private long lunchSalary;
  private long trafficSalary;
  private long allSalary;
  private long pensionBase;
  private double pensionPer;
  private java.sql.Timestamp createDate;
  private long medicalBase;
  private double medicalPer;
  private long accumulationFundBase;
  private double accumulationFundPer;
  private String name;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getBasicSalary() {
    return basicSalary;
  }

  public void setBasicSalary(long basicSalary) {
    this.basicSalary = basicSalary;
  }


  public long getBonus() {
    return bonus;
  }

  public void setBonus(long bonus) {
    this.bonus = bonus;
  }


  public long getLunchSalary() {
    return lunchSalary;
  }

  public void setLunchSalary(long lunchSalary) {
    this.lunchSalary = lunchSalary;
  }


  public long getTrafficSalary() {
    return trafficSalary;
  }

  public void setTrafficSalary(long trafficSalary) {
    this.trafficSalary = trafficSalary;
  }


  public long getAllSalary() {
    return allSalary;
  }

  public void setAllSalary(long allSalary) {
    this.allSalary = allSalary;
  }


  public long getPensionBase() {
    return pensionBase;
  }

  public void setPensionBase(long pensionBase) {
    this.pensionBase = pensionBase;
  }


  public double getPensionPer() {
    return pensionPer;
  }

  public void setPensionPer(double pensionPer) {
    this.pensionPer = pensionPer;
  }


  public java.sql.Timestamp getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public long getMedicalBase() {
    return medicalBase;
  }

  public void setMedicalBase(long medicalBase) {
    this.medicalBase = medicalBase;
  }


  public double getMedicalPer() {
    return medicalPer;
  }

  public void setMedicalPer(double medicalPer) {
    this.medicalPer = medicalPer;
  }


  public long getAccumulationFundBase() {
    return accumulationFundBase;
  }

  public void setAccumulationFundBase(long accumulationFundBase) {
    this.accumulationFundBase = accumulationFundBase;
  }


  public double getAccumulationFundPer() {
    return accumulationFundPer;
  }

  public void setAccumulationFundPer(double accumulationFundPer) {
    this.accumulationFundPer = accumulationFundPer;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
