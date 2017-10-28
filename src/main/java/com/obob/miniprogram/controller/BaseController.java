package com.obob.miniprogram.controller;

import com.alibaba.fastjson.JSONObject;
import com.obob.support.ResponseCodeBase;
import com.obob.support.ResponseCodeProperties;

public class BaseController {
	
	private static final int CODE_OK = ResponseCodeBase.OK;
	
	private static final String CODE_MSG = ResponseCodeProperties.getProperty(ResponseCodeBase.OK);
	
	public String response(Object data) { 
		JSONObject json = new JSONObject();
		json.put("code", CODE_OK);
		json.put("msg", CODE_MSG);
		json.put("data", data);
		return json.toJSONString();
	}
}
