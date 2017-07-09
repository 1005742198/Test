package com.obob.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obob.test.service.support.PersonRoleRelationSupportService;
import com.obob.test.service.support.PersonSupportService;

@Service
public class PersonService {
	
	@Autowired
	private PersonSupportService personSupportService;
	@Autowired
	private PersonRoleRelationSupportService relationSupportService;
	
	public void initPerson() {
		//创建一个人
		//创建角色
		//关联角色
	}
}
