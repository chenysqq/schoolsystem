package com.lulu.schoolsystem.vo;
/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午10:51:21 
  * @version：   1.0.0
  * @describe:    
  */
public class StudentVO {
	
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
	private String inTime;
	private String status;
	private String createTime;
	private String updateTime;
	private ClazzVO  clazzVO;
	private DormitoryVO dormitoryVO;
	public StudentVO() {
		super();
		
	}
	public StudentVO(String uuid, String idCard, String idCardType, String stuName, String preName, String nationNo,
			String stuBirth, String cellPhone, String homePhone, String registeredAddress, String address,
			String stuSex, String politicalNo, String inTime, String status, String createTime, String updateTime,
			ClazzVO clazzVO, DormitoryVO dormitoryVO) {
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
		this.inTime = inTime;
		this.status = status;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.clazzVO = clazzVO;
		this.dormitoryVO = dormitoryVO;
	}
	@Override
	public String toString() {
		return "StudentVO [uuid=" + uuid + ", idCard=" + idCard + ", idCardType=" + idCardType + ", stuName=" + stuName
				+ ", preName=" + preName + ", nationNo=" + nationNo + ", stuBirth=" + stuBirth + ", cellPhone="
				+ cellPhone + ", homePhone=" + homePhone + ", registeredAddress=" + registeredAddress + ", address="
				+ address + ", stuSex=" + stuSex + ", politicalNo=" + politicalNo + ", inTime=" + inTime + ", status="
				+ status + ", createTime=" + createTime + ", updateTime=" + updateTime + ", clazzVO=" + clazzVO
				+ ", dormitoryVO=" + dormitoryVO + "]";
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
	public ClazzVO getClazzVO() {
		return clazzVO;
	}
	public void setClazzVO(ClazzVO clazzVO) {
		this.clazzVO = clazzVO;
	}
	public DormitoryVO getDormitoryVO() {
		return dormitoryVO;
	}
	public void setDormitoryVO(DormitoryVO dormitoryVO) {
		this.dormitoryVO = dormitoryVO;
	}
	
	
}
