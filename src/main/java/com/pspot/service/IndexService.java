package com.pspot.service;


import java.util.List;
import java.util.Map;

import com.pspot.mapper.InfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository
public class IndexService{
	
	@Autowired
    private InfoMapper infoMapper;


	/**
	 * 查询人员基本信息
	 * @param gcbh 网办过程编号
	 * @return
	 */
	public  List<Map<String,Object>> GetPersonInfo(String gcbh){
		List<Map<String,Object>> result = infoMapper.findByGcbh(gcbh);
		return result;
	}

	/**
	 * 查询案件基本信息
	 * @param ajbh 案件信息编号-A号
	 * @return
	 */
	public  List<Map<String,Object>> GetCaseInfo(String ajbh){
		List<Map<String,Object>> result = infoMapper.findByAjbh(ajbh);
		return result;
	}
	
	
}
