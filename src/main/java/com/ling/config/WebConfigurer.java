package com.ling.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 凌端辉
 * @email lingduanhui@asiacom.net.cn
 * @Date:2022/11/29 21:46
 * @version：1.0
 **/
@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("main.html").setViewName("dashboard");
        registry.addViewController("index.html").setViewName("index");
        registry.addViewController("/").setViewName("index");

    }
}
