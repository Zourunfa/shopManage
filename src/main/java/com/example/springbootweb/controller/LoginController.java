package com.example.springbootweb.controller;

import com.example.springbootweb.mapper.UserMapper;
import com.example.springbootweb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
//@Repository
public class LoginController {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @GetMapping("/userlist")
//    @ResponseBody
//    public List<Map<String,Object>> userList(){
//        String sql = "select * from manager";
//        List<Map<String,Object>> list_maps = jdbcTemplate.queryForList(sql);
//        return list_maps;
//    }
//    public List<Map<String, Object>> userList(){
//        String sql = "select * from manager";
//        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
//        return maps;
//    }
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/user/login")
    public String queryUserByName(
            @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model, HttpSession session
    ){
//        System.out.println(username);
        User user = userMapper.queryUserByName(username);
//        System.out.println(user);
//        System.out.println(user.getPassword());

        if(password.equals(user.getPassword())){
            session.setAttribute("loginUser",username);
            return "index";
        }else{
            model.addAttribute("msg","用户名或者密码错误");
            return "login";
        }

    }



//    @RequestMapping("/user/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        Model model, HttpSession session){
//        if(!StringUtils.isEmpty(username)&&"123".equals(password)){
//            session.setAttribute("loginUser",username);
////            System.out.println(1);
//            return  "index";
//        }else {
////            告诉用户 你登录失败了
//            model.addAttribute("msg","用户名或者密码错误");
//            return "login";
//        }
//    }

}
