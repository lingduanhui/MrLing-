package com.ling.controller;

import com.ling.pojo.TestPojo;
import com.ling.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author 凌端辉
 * @email lingduanhui@asiacom.net.cn
 * @Date:2022/11/29 21:05
 * @version：1.0
 **/
@Controller
public class IndexController {


    @GetMapping("user/login")
    public String login(
            @RequestParam("inputEmail") String inputEmail,
            @RequestParam("inputPassword") String inputPassword,
            Model model){
        if ("lingduanhui@126.com".equals(inputEmail) && ("123456").equals(inputPassword)){
            return "redirect:/main.html";
        }else{
            model.addAttribute("msg","邮箱或密码错误！");
            return "redirect:/index.html";
        }

    }
}
