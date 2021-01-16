package com.example.springbootweb.congfig;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHandlerInterceptor  implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        登录成功之后，应该有用户的session
        Object loginUser = request.getSession().getAttribute("loginUser");
        System.out.println(loginUser);
        if(loginUser == null){
            request.setAttribute("msg","请先登录才可以进行下列操作 ");
            request.getRequestDispatcher("/").forward(request,response);
            return false;
        }else {
            return  true;
        }


    }
}
