package com.ling.service.impl;

import com.ling.mapper.TestMapper;
import com.ling.pojo.TestPojo;
import com.ling.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 凌端辉
 * @email lingduanhui@asiacom.net.cn
 * @Date:2022/12/1 11:19
 * @version：1.0
 **/
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private TestMapper testMapper;

    @Override
    public List<TestPojo> get(){
        return  testMapper.get();
    }
}
