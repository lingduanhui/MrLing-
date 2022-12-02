package com.ling.service;

import com.ling.pojo.TestPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 凌端辉
 * @email lingduanhui@asiacom.net.cn
 * @Date:2022/12/1 11:19
 * @version：1.0
 **/

public interface TestService {
    List<TestPojo> get();
}
