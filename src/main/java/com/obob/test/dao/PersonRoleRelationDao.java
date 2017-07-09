package com.obob.test.dao;

import java.util.List;
import java.util.Map;

import com.obob.db.MyBatisDao;
import com.obob.test.po.PersonRoleRelationPo;

/**
 * 
 * PersonRoleRelation
 * @author hongbo.zhao
 * 2017-07-09 57:12:50
 */
@MyBatisDao
public interface PersonRoleRelationDao {
	public int insert(PersonRoleRelationPo o);
	
	public int update(PersonRoleRelationPo o);
	
	public void delete(Integer id);
	
	public PersonRoleRelationPo getById(Integer id);
	
	public List<PersonRoleRelationPo> select(Map<String, Object> map);
}
