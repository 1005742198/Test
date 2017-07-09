package com.obob.test.service.support;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obob.test.dao.PersonDao;
import com.obob.test.po.PersonPo;

@Service
public class PersonSupportService {
	
	@Autowired
	private PersonDao personDao;
	
	public int insert(PersonPo personPo) {
		return personDao.insert(personPo);
	}
	
	public int update(PersonPo personPo) {
		return personDao.update(personPo);
	}
	
	public void delete(Integer id) { 
		personDao.delete(id);
	}
	
	public List<PersonPo> select(Map<String, Object> map) {
		return personDao.select(map);
	}
}
