package com.pspot.web;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pspot.annotation.Encode;
import com.pspot.utils.DesUtil;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pspot.service.IndexService;


@RestController
@Log4j
public class IndexController {
	
	@Autowired
	IndexService indexService;
	
	
	@RequestMapping("/")
    public String home(ModelMap map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "欢迎");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }

	/**
	 * 查询人员基本信息
	 * @param gcbh 网办过程编号
	 * @return
	 */
	@RequestMapping(value = "/ryjbxx", method = RequestMethod.GET)
	@Encode
	public Map<String,Object> getPersonInfo(@RequestParam String currentTime,@RequestParam String md5Str,@RequestParam String gcbh) {

		Map<String,Object> resultMap = new HashMap<>();
		try {
			if(DesUtil.EncoderByMd5(currentTime + DesUtil.SALT).equals(md5Str)){
				List<Map<String,Object>> userInfo = indexService.GetPersonInfo(gcbh);
				resultMap.put("success", true);
				resultMap.put("rows", userInfo);
			}else{
				throw new Exception("not have authority");
			}
		} catch (Exception e) {
			resultMap.put("success", false);
			resultMap.put("message", e.getMessage());
		}
		return resultMap;
	}

	/**
	 * 查询案件基本信息
	 * @param ajbh 案件信息编号-A号
	 * @return
	 */
	@RequestMapping(value = "/ajjbxx", method = RequestMethod.GET)
	@Encode
	public Map<String,Object> getCaseInfo(@RequestParam String currentTime,@RequestParam String md5Str,@RequestParam String ajbh) {

		Map<String,Object> resultMap = new HashMap<>();
		try {
			if(DesUtil.EncoderByMd5(currentTime + DesUtil.SALT).equals(md5Str)){
				List<Map<String,Object>> userInfo = indexService.GetCaseInfo(ajbh);
				resultMap.put("success", true);
				resultMap.put("rows", userInfo);
			}else{
				throw new Exception("not have authority");
			}

		} catch (Exception e) {
			resultMap.put("success", false);
			resultMap.put("message", e.getMessage());
		}
		return resultMap;
	}
}
