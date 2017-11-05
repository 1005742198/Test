package com.obob.miniprogram.service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import com.obob.miniprogram.dao.GlobalFileDao;
import com.obob.miniprogram.po.GlobalFilePo;

/**
 * 
 * GlobalFile
 * @author hongbo.zhao
 * 2017-10-29 39:20:41
 */
@Service("GglobalFileService")
public class GlobalFileService {
	@Autowired
	private GlobalFileDao globalFileDao;
	
	public GlobalFilePo selectByGuid(String guid) {
		Map<String, Object> map = new HashMap<>(1);
		map.put("fileGuid", guid);
		List<GlobalFilePo> list = globalFileDao.select(map);
		if(CollectionUtils.isEmpty(list)) {
			return null;
		}
		return list.get(0);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int insert(GlobalFilePo o) {
		globalFileDao.insert(o);
		return o.getId();
	}
	
	@Transactional(rollbackFor = Exception.class)
	public int update(GlobalFilePo o) {
		return globalFileDao.update(o);
	}
	
	@Transactional(rollbackFor = Exception.class)
	public void delete(Integer id) {
		globalFileDao.getById(id);
	}
	
	public GlobalFilePo getById(Integer id) {
		return globalFileDao.getById(id);
	}
	
	public List<GlobalFilePo> select(Map<String, Object> map) {
		return globalFileDao.select(map);
	}
}
