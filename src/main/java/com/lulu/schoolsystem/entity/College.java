package com.lulu.schoolsystem.entity;
/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午8:03:46 
  * @version：   1.0.0
  * @describe:    
  */
public class College {
	
	private String uuid;
	private String collegeCnName;
	private String collegeEngName;
	private String createTime;
	private String updateTime;
	private String status;
	public College() {
		super();
		
	}
	public College(String uuid, String collegeCnName, String collegeEngName, String createTime, String updateTime,
			String status) {
		super();
		this.uuid = uuid;
		this.collegeCnName = collegeCnName;
		this.collegeEngName = collegeEngName;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.status = status;
	}
	@Override
	public String toString() {
		return "College [uuid=" + uuid + ", collegeCnName=" + collegeCnName + ", collegeEngName=" + collegeEngName
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", status=" + status + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCollegeCnName() {
		return collegeCnName;
	}
	public void setCollegeCnName(String collegeCnName) {
		this.collegeCnName = collegeCnName;
	}
	public String getCollegeEngName() {
		return collegeEngName;
	}
	public void setCollegeEngName(String collegeEngName) {
		this.collegeEngName = collegeEngName;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
