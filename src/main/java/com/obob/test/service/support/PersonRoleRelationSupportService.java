package com.obob.test.service.support;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obob.test.dao.PersonRoleRelationDao;
import com.obob.test.po.PersonRoleRelationPo;

@Service
public class PersonRoleRelationSupportService {
	
	@Autowired
	private PersonRoleRelationDao personRoleRelationDao;
	
	public int insert(PersonRoleRelationPo relationPo) {
		return personRoleRelationDao.insert(relationPo);
	}
	
	public int update(PersonRoleRelationPo relationPo) {
		return personRoleRelationDao.update(relationPo);
	}
	
	public void delete(Integer id) {
		personRoleRelationDao.delete(id);
	}
	
	public List<PersonRoleRelationPo> select(Map<String, Object> map) {
		return personRoleRelationDao.select(map);
	}
}
