package com.obob.miniprogram.po;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * SysParam
 * @author hongbo.zhao
 * 2017-11-05 02:17:04
 */
public class SysParamPo {
	/**
	 * id
	 */
	private Integer id;
	/**
	 * paramKey
	 */
	private String paramKey;
	/**
	 * paramValue
	 */
	private String paramValue;
	/**
	 * disabled
	 */
	private Boolean disabled;
	/**
	 * createOperatorId
	 */
	private Integer createOperatorId;
	/**
	 * createTime
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;
	/**
	 * updateOperatorId
	 */
	private Integer updateOperatorId;
	/**
	 * updateTime
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date updateTime;

	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getId() {
		return this.id;
	}
	public void setParamKey(String value) {
		this.paramKey = value;
	}
	public String getParamKey() {
		return this.paramKey;
	}
	public void setParamValue(String value) {
		this.paramValue = value;
	}
	public String getParamValue() {
		return this.paramValue;
	}
	public void setDisabled(Boolean value) {
		this.disabled = value;
	}
	public Boolean getDisabled() {
		return this.disabled;
	}
	public void setCreateOperatorId(Integer value) {
		this.createOperatorId = value;
	}
	public Integer getCreateOperatorId() {
		return this.createOperatorId;
	}
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setUpdateOperatorId(Integer value) {
		this.updateOperatorId = value;
	}
	public Integer getUpdateOperatorId() {
		return this.updateOperatorId;
	}
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}

}

