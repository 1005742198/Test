package com.obob.miniprogram.dao;

import java.util.List;
import java.util.Map;

import com.obob.db.MyBatisDao;
import com.obob.miniprogram.po.GlobalFilePo;

/**
 * 
 * GlobalFile
 * @author hongbo.zhao
 * 2017-10-29 39:20:41
 */
@MyBatisDao
public interface GlobalFileDao {
	public int insert(GlobalFilePo o);
	
	public int update(GlobalFilePo o);
	
	public void delete(Integer id);
	
	public GlobalFilePo getById(Integer id);
	
	public List<GlobalFilePo> select(Map<String, Object> map);
}
