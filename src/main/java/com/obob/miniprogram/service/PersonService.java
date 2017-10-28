package com.obob.miniprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obob.miniprogram.po.PersonPo;
import com.obob.miniprogram.service.support.PersonRoleRelationSupportService;
import com.obob.miniprogram.service.support.PersonSupportService;

@Service
public class PersonService {
	
	@Autowired
	private PersonSupportService personSupportService;
	@Autowired
	private PersonRoleRelationSupportService relationSupportService;
	
	public void initPerson() {
	}
	public PersonPo getById(Integer id) {
		return personSupportService.getById(id);
	}
}
