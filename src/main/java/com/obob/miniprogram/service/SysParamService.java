package com.obob.miniprogram.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.obob.miniprogram.dao.SysParamDao;
import com.obob.miniprogram.po.SysParamPo;

/**
 * 
 * SysParam
 * @author hongbo.zhao
 * 2017-11-05 02:17:04
 */
@Service("sysParamService")
public class SysParamService {
	@Autowired
	private SysParamDao sysParamDao;
	
	@Transactional(rollbackFor = Exception.class)
	public int insert(SysParamPo o) {
		sysParamDao.insert(o);
		return o.getId();
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int update(SysParamPo o) {
		return sysParamDao.update(o);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void delete(Integer id) {
		sysParamDao.getById(id);
	}
	
	public SysParamPo getById(Integer id) {
		return sysParamDao.getById(id);
	}
	
	public List<SysParamPo> select(Map<String, Object> map) {
		return sysParamDao.select(map);
	}
}
