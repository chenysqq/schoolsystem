package com.lulu.schoolsystem.entity;
/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午10:54:24 
  * @version：   1.0.0
  * @describe:    
  */
public class Nation {
	private String uuid;
	private String cnDesc;
	private String engDesc;
	private String createTime;
	private String updateTime;
	private String status;
	public Nation() {
		super();
		
	}
	public Nation(String uuid, String cnDesc, String engDesc, String createTime, String updateTime, String status) {
		super();
		this.uuid = uuid;
		this.cnDesc = cnDesc;
		this.engDesc = engDesc;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.status = status;
	}
	@Override
	public String toString() {
		return "Nation [uuid=" + uuid + ", cnDesc=" + cnDesc + ", engDesc=" + engDesc + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", status=" + status + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getCnDesc() {
		return cnDesc;
	}
	public void setCnDesc(String cnDesc) {
		this.cnDesc = cnDesc;
	}
	public String getEngDesc() {
		return engDesc;
	}
	public void setEngDesc(String engDesc) {
		this.engDesc = engDesc;
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
