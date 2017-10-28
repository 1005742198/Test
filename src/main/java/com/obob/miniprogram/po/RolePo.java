package com.obob.miniprogram.po;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

/**
 * 
 * Role
 * @author hongbo.zhao
 * 2017-07-09 56:12:39
 */
public class RolePo {
	/**
	 * 主键
	 */
	private Integer id;
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 角色信息描述
	 */
	private String roleDesc;
	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")  
	private java.util.Date createTime;
	/**
	 * 创建人，member_operator.id
	 */
	private Integer createOperatorId = 0;
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
	public void setRoleName(String value) {
		this.roleName = value;
	}
	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleDesc(String value) {
		this.roleDesc = value;
	}
	public String getRoleDesc() {
		if(StringUtils.isEmpty(roleDesc)) {
			return this.roleName;
		}
		return roleDesc;
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

