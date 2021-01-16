package com.example.springbootweb.controller;

import com.example.springbootweb.Dao.GoodsDao;
import com.example.springbootweb.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class GoodsController {

    @Autowired
    GoodsDao goodsDao;

    @RequestMapping("/goodsArr")
    public  String list(Model model){
        Collection<Goods> goodsArr = goodsDao.getAll();
        model.addAttribute("goodsArr",goodsArr);
        System.out.println(goodsArr);
        return "basic_table";
    }


}
