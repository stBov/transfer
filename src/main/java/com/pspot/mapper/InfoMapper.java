package com.pspot.mapper;


import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;



public interface InfoMapper {

    /**
     * 查询人员基本信息
     * @param gcbh 网办过程编号
     * @return
     */
	 List<Map<String,Object>> findByGcbh(@Param("gcbh") String gcbh);

    /**
     * 查询案件基本信息
     * @param ajbh 案件信息编号-A号
     * @return
     */
     List<Map<String,Object>> findByAjbh(@Param("ajbh") String ajbh);
	
}
