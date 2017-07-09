package com.obob.test.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.obob.rest.response.DataResponse;
import com.obob.support.ResponseCodeBase;
import com.obob.support.ResponseCodeProperties;
import com.obob.test.service.PersonService;
import com.obob.test.service.RoleService;

@Controller
@Path("human")
public class HumanRest {
	
	private static final int CODE_OK = ResponseCodeBase.OK;
	
	private static final String CODE_MSG = ResponseCodeProperties.getProperty(ResponseCodeBase.OK);
	
	@Autowired
	private PersonService personService;
	@Autowired
	private RoleService roleService;
	
	@POST
	@Path("init_role")
	@Produces("application/json;charset=utf-8")
	public Response initRole() {
		roleService.initRole();
		return DataResponse.build().setRetcode(CODE_OK).setMsg(CODE_MSG).toResponse();
	}
	
	@POST
	@Path("init_person")
	@Produces("application/json;charset=utf-8")
	public Response initPerson() {
		personService.initPerson();
		return DataResponse.build().setRetcode(CODE_OK).setMsg(CODE_MSG).toResponse();
	}
	
}
