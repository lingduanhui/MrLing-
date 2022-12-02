package com.ling.mapper;

import com.ling.pojo.TestPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 凌端辉
 * @email lingduanhui@asiacom.net.cn
 * @Date:2022/12/1 11:17
 * @version：1.0
 **/
@Mapper
public interface TestMapper {

    List<TestPojo> get();
}
