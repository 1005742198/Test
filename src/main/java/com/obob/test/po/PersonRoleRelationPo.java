package com.obob.test.po;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * PersonRoleRelation
 * @author hongbo.zhao
 * 2017-07-09 57:12:50
 */
public class PersonRoleRelationPo {
	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 人物id，对应person表的id
	 */
	private Integer personId;
	/**
	 * 角色id，对应role表的id
	 */
	private Integer roleId;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;
	/**
	 * 创建人,member_operator.id
	 */
	private Integer createOperatorId;
	/**
	 * 更新时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date updateTime;
	/**
	 * 更新人,member_operator.id
	 */
	private Integer updateOperatorId;

	public void setId(Integer value) {
		this.id = value;
	}
	public Integer getId() {
		return this.id;
	}
	public void setPersonId(Integer value) {
		this.personId = value;
	}
	public Integer getPersonId() {
		return this.personId;
	}
	public void setRoleId(Integer value) {
		this.roleId = value;
	}
	public Integer getRoleId() {
		return this.roleId;
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

