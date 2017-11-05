package com.obob.miniprogram.dao;

import java.util.List;
import java.util.Map;

import com.obob.db.MyBatisDao;
import com.obob.miniprogram.po.SysParamPo;

/**
 * 
 * SysParam
 * @author hongbo.zhao
 * 2017-11-05 02:17:04
 */
@MyBatisDao
public interface SysParamDao {
	public int insert(SysParamPo o);
	
	public int update(SysParamPo o);
	
	public void delete(Integer id);
	
	public SysParamPo getById(Integer id);
	
	public List<SysParamPo> select(Map<String, Object> map);
}
