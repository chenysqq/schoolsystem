package com.lulu.schoolsystem.entity;
/** @author:  v_chenyongshuai@:
  * @date:  2018年9月10日 下午10:53:36 
  * @version：   1.0.0
  * @describe:    
  */
public class Student {
	private String uuid;
	private String idCard;
	private String idCardType;
	private String stuName;
	private String preName;
	private String nationNo;
	private String stuBirth;
	private String cellPhone;
	private String homePhone;
	private String registeredAddress;
	private String address;
	private String stuSex;
	private String politicalNo;
	private String classNo;
	private String dormitoryNo;
	private String inTime;
	private String status;
	private String createTime;
	private String updateTime;
	public Student() {
		super();	
	}
	public Student(String uuid, String idCard, String idCardType, String stuName, String preName, String nationNo,
			String stuBirth, String cellPhone, String homePhone, String registeredAddress, String address,
			String stuSex, String politicalNo, String classNo, String dormitoryNo, String inTime, String status,
			String createTime, String updateTime) {
		super();
		this.uuid = uuid;
		this.idCard = idCard;
		this.idCardType = idCardType;
		this.stuName = stuName;
		this.preName = preName;
		this.nationNo = nationNo;
		this.stuBirth = stuBirth;
		this.cellPhone = cellPhone;
		this.homePhone = homePhone;
		this.registeredAddress = registeredAddress;
		this.address = address;
		this.stuSex = stuSex;
		this.politicalNo = politicalNo;
		this.classNo = classNo;
		this.dormitoryNo = dormitoryNo;
		this.inTime = inTime;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public String getIdCardType() {
		return idCardType;
	}
	public void setIdCardType(String idCardType) {
		this.idCardType = idCardType;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getPreName() {
		return preName;
	}
	public void setPreName(String preName) {
		this.preName = preName;
	}
	public String getNationNo() {
		return nationNo;
	}
	public void setNationNo(String nationNo) {
		this.nationNo = nationNo;
	}
	public String getStuBirth() {
		return stuBirth;
	}
	public void setStuBirth(String stuBirth) {
		this.stuBirth = stuBirth;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getRegisteredAddress() {
		return registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public String getPoliticalNo() {
		return politicalNo;
	}
	public void setPoliticalNo(String politicalNo) {
		this.politicalNo = politicalNo;
	}
	public String getClassNo() {
		return classNo;
	}
	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}
	public String getDormitoryNo() {
		return dormitoryNo;
	}
	public void setDormitoryNo(String dormitoryNo) {
		this.dormitoryNo = dormitoryNo;
	}
	public String getInTime() {
		return inTime;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	
}
