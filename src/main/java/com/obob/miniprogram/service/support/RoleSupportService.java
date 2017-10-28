package com.obob.miniprogram.service.support;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.obob.miniprogram.dao.RoleDao;
import com.obob.miniprogram.po.RolePo;

@Service
public class RoleSupportService {
	
	@Autowired
	private RoleDao roleDao;
	
	public int insert(RolePo rolePo) {
		return roleDao.insert(rolePo);
	}
	
	public int update(RolePo rolePo) {
		return roleDao.update(rolePo);
	}
	
	public void delete(int id) {
		roleDao.delete(id);
	}
	
	public List<RolePo> select(Map<String, Object> map) {
		return roleDao.select(map);
	}
}
