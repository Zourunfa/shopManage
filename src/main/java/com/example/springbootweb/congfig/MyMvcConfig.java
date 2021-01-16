package com.example.springbootweb.congfig;
//扩展springmvc的项目


import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//扩展 springmvc  dispatchservlet
//如果 你想diy一些定制化的功能 只要写这哥组件 交给springBoot springboot就会帮我们自动装配

//如果我们要扩展springMVC  官方建议我们这样去做  @Configuration 不能够加载@EnableWebMVC

@Configuration
//@EnableWebMvc //这玩意就是导入了一个类：DelegatingWebMvcConfiguration:从容器 获取中所有的webmvcconfig
public class MyMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName(("login"));
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/manage").setViewName("responsive_table");
        registry.addViewController("/index").setViewName("index");
//        registry.addViewController("/analysis").setViewName("Analysis");
//        registry.addViewController("/")
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**").excludePathPatterns("/","/login.html","/user/login");
    }
}


