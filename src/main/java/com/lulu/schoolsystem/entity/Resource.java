package com.lulu.schoolsystem.entity;

import java.io.Serializable;
import java.util.List;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月9日 下午9:55:14 
  * @version：   1.0.0
  * @describe:    
  */
public class Resource implements Serializable{
	
	private String uuid;
	private int showSeq;
	private String resName;
	private String parentId;
	private String resHref;
	private String resType;
	private String status;
	private String resIcon;
	private String createTime;
	private String updateTime;
	private List<Resource> sons;
	public Resource() {
		super();
		
	}
	public Resource(String uuid, int showSeq, String resName, String parentId, String resHref, String resType,
			String status, String resIcon, String createTime, String updateTime, List<Resource> sons) {
		super();
		this.uuid = uuid;
		this.showSeq = showSeq;
		this.resName = resName;
		this.parentId = parentId;
		this.resHref = resHref;
		this.resType = resType;
		this.status = status;
		this.resIcon = resIcon;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.sons = sons;
	}
	@Override
	public String toString() {
		return "Resource [uuid=" + uuid + ", showSeq=" + showSeq + ", resName=" + resName + ", parentId=" + parentId
				+ ", resHref=" + resHref + ", resType=" + resType + ", status=" + status + ", resIcon=" + resIcon
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + ", sons=" + sons + "]";
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public int getShowSeq() {
		return showSeq;
	}
	public void setShowSeq(int showSeq) {
		this.showSeq = showSeq;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String getResHref() {
		return resHref;
	}
	public void setResHref(String resHref) {
		this.resHref = resHref;
	}
	public String getResType() {
		return resType;
	}
	public void setResType(String resType) {
		this.resType = resType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getResIcon() {
		return resIcon;
	}
	public void setResIcon(String resIcon) {
		this.resIcon = resIcon;
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
	public List<Resource> getSons() {
		return sons;
	}
	public void setSons(List<Resource> sons) {
		this.sons = sons;
	}
				
}
