package com.pspot.service;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by win-20161010 on 2017/7/7.
 */
public class IndexServiceTest extends BaseCaseTest{

    @Autowired
    IndexService indexService;

    @Test
    public void test_getPersonInfo(){
        List<Map<String,Object>> listResult = indexService.GetCaseInfo("001");
        Assert.assertNotNull(listResult);
    }
}
