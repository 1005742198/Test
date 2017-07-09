package com.obob.test.dao;

import java.util.List;
import java.util.Map;

import com.obob.db.MyBatisDao;
import com.obob.test.po.PersonPo;

/**
 * 
 * Person
 * @author hongbo.zhao
 * 2017-07-09 42:11:11
 */
@MyBatisDao
public interface PersonDao {
	public int insert(PersonPo o);
	
	public int update(PersonPo o);
	
	public void delete(Integer id);
	
	public PersonPo getById(Integer id);
	
	public List<PersonPo> select(Map<String, Object> map);
}
