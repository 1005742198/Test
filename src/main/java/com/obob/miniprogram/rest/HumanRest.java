//package com.obob.miniprogram.rest;
//
//import javax.ws.rs.GET;
//import javax.ws.rs.POST;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.Response;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//
//import com.obob.miniprogram.po.PersonPo;
//import com.obob.miniprogram.service.PersonService;
//import com.obob.miniprogram.service.RoleService;
//import com.obob.rest.response.DataResponse;
//import com.obob.support.ResponseCodeBase;
//import com.obob.support.ResponseCodeProperties;
//
//@Controller
//@Path("human")
//public class HumanRest {
//	
//	private static final int CODE_OK = ResponseCodeBase.OK;
//	
//	private static final String CODE_MSG = ResponseCodeProperties.getProperty(ResponseCodeBase.OK);
//	
//	@Autowired
//	private PersonService personService;
//	@Autowired
//	private RoleService roleService;
//	
//	@POST
//	@Path("init_role")
//	@Produces("application/json;charset=utf-8")
//	public Response initRole() {
//		roleService.initRole();
//		return DataResponse.build().setRetcode(CODE_OK).setMsg(CODE_MSG).toResponse();
//	}
//	
//	@POST
//	@Path("init_person")
//	@Produces("application/json;charset=utf-8")
//	public Response initPerson() {
//		personService.initPerson();
//		return DataResponse.build().setRetcode(CODE_OK).setMsg(CODE_MSG).toResponse();
//	}
//	
//	@GET
//	@Path("getbyid")
//	@Produces("application/json;charset=utf-8")
//	public Response getById(Integer id) {
//		PersonPo personPo = personService.getById(id);
//		return DataResponse.build().setRetcode(CODE_OK).setMsg(CODE_MSG).setData(personPo).toResponse();
//	}
//	
//}
