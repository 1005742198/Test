package com.obob.miniprogram.domain.vo;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * Person
 * @author hongbo.zhao
 * 2017-07-09 42:11:11
 */
public class PersonVo implements Serializable {
	/**
	 * @author obob
	 * 2017年10月22日 下午3:27:06
	 */
	private static final long serialVersionUID = 6774531843496247858L;
	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 编码
	 */
	private String personCode;
	/**
	 * guid
	 */
	private String personGuid;
	/**
	 * 名称
	 */
	private String personName;
	/**
	 * 出生日期
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date birthDate;
	/**
	 * 性别
	 */
	private Boolean gender;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;
	/**
	 * 创建人，member_operator.id
	 */
	private Integer createOperatorId;
	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date updateTime;
	/**
	 * 更新人，member_operator.id
	 */
	private Integer updateOperatorId;

	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getId() {
		return this.id;
	}
	public void setPersonCode(String value) {
		this.personCode = value;
	}
	public String getPersonCode() {
		return this.personCode;
	}
	public void setPersonGuid(String value) {
		this.personGuid = value;
	}
	public String getPersonGuid() {
		return this.personGuid;
	}
	public void setPersonName(String value) {
		this.personName = value;
	}
	public String getPersonName() {
		return this.personName;
	}
	public void setBirthDate(java.util.Date value) {
		this.birthDate = value;
	}
	public java.util.Date getBirthDate() {
		return this.birthDate;
	}
	public void setGender(Boolean value) {
		this.gender = value;
	}
	public Boolean getGender() {
		return this.gender;
	}
	public void setCreateTime(java.util.Date value) {
		this.createTime = value;
	}
	public java.util.Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateOperatorId(Integer value) {
		this.createOperatorId = value;
	}
	public Integer getCreateOperatorId() {
		return this.createOperatorId;
	}
	public void setUpdateTime(java.util.Date value) {
		this.updateTime = value;
	}
	public java.util.Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateOperatorId(Integer value) {
		this.updateOperatorId = value;
	}
	public Integer getUpdateOperatorId() {
		return this.updateOperatorId;
	}

}

