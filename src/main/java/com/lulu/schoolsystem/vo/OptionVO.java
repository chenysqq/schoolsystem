package com.lulu.schoolsystem.vo;

import java.util.List;

/** @author:  v_chenyongshuai@:
  * @date:  2018年9月14日 下午1:35:29 
  * @version：   1.0.0
  * @describe:    
  */
public class OptionVO {
		
	private String value;
	private String label;
	private List<OptionVO> children;
	public OptionVO() {
		super();
		
	}
	public OptionVO(String value, String label, List<OptionVO> children) {
		super();
		this.value = value;
		this.label = label;
		this.children = children;
	}
	@Override
	public String toString() {
		return "OptionVO [value=" + value + ", label=" + label + ", children=" + children + "]";
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public List<OptionVO> getChildren() {
		return children;
	}
	public void setChildren(List<OptionVO> children) {
		this.children = children;
	}
	
}
