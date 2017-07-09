package com.obob.test.dao;

import java.util.List;
import java.util.Map;

import com.obob.db.MyBatisDao;
import com.obob.test.po.RolePo;

/**
 * 
 * Role
 * @author hongbo.zhao
 * 2017-07-09 56:12:39
 */
@MyBatisDao
public interface RoleDao {
	public int insert(RolePo o);
	
	public int update(RolePo o);
	
	public void delete(Integer id);
	
	public RolePo getById(Integer id);
	
	public List<RolePo> select(Map<String, Object> map);
}
