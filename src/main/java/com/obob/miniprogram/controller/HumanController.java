package com.obob.miniprogram.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.obob.miniprogram.domain.vo.PersonVo;
import com.obob.miniprogram.po.PersonPo;
import com.obob.miniprogram.service.PersonService;
import com.obob.miniprogram.util.BeanConvertors;

@Controller
@RequestMapping("human")
public class HumanController extends BaseController {
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping(value = "getbyid", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String getById(Integer id) {
		PersonPo personPo = personService.getById(id);
		PersonVo personVo = new PersonVo();
		BeanConvertors.copyProperties(personPo, personVo, null);
		return response(personVo);
	}
	
}
