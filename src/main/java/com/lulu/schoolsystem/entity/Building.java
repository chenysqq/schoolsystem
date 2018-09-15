package com.lulu.schoolsystem.entity;
/** @author:  v_chenyongshuai@:
  * @date:  2018年9月13日 下午4:30:11 
  * @version：   1.0.0
  * @describe:    
  */
public class Building {
	
	private String uuid;
	private String buildingCnName;
	private String buildingEngName;
	private String createTime;
	private String updateTime;
	private String status;
	public Building() {
		super();
		
	}
	public Building(String uuid, String buildingCnName, String buildingEngName, String createTime, String updateTime,
			String status) {
		super();
		this.uuid = uuid;
		this.buildingCnName = buildingCnName;
		this.buildingEngName = buildingEngName;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Building [uuid=" + uuid + ", buildingCnName=" + buildingCnName + ", buildingEngName=" + buildingEngName
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", status=" + status + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getBuildingCnName() {
		return buildingCnName;
	}
	public void setBuildingCnName(String buildingCnName) {
		this.buildingCnName = buildingCnName;
	}
	public String getBuildingEngName() {
		return buildingEngName;
	}
	public void setBuildingEngName(String buildingEngName) {
		this.buildingEngName = buildingEngName;
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
