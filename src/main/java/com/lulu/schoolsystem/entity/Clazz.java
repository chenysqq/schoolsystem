package com.lulu.schoolsystem.entity;
/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午8:06:24 
  * @version：   1.0.0
  * @describe:    
  */
public class Clazz {
	private String uuid;
	private String claName;
	private String status;
	private String collegeNo;
	private String createTime;
	private String updateTime;
	public Clazz() {
		super();
		
	}
	public Clazz(String uuid, String claName, String status, String collegeNo, String createTime, String updateTime) {
		super();
		this.uuid = uuid;
		this.claName = claName;
		this.status = status;
		this.collegeNo = collegeNo;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Clazz [uuid=" + uuid + ", claName=" + claName + ", status=" + status + ", collegeNo=" + collegeNo
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getClaName() {
		return claName;
	}
	public void setClaName(String claName) {
		this.claName = claName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCollegeNo() {
		return collegeNo;
	}
	public void setCollegeNo(String collegeNo) {
		this.collegeNo = collegeNo;
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
