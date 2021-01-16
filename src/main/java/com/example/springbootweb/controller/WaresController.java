package com.example.springbootweb.controller;

import com.example.springbootweb.Dao.WaresDao;
import com.example.springbootweb.mapper.WaresMappper;
import com.example.springbootweb.pojo.User;
import com.example.springbootweb.pojo.Wares;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Controller
public class WaresController {
    @Autowired
    private WaresMappper waresMappper;
//    WaresDao waresDao;


//    public String list(Model model){
//        Collection<Wares> waresMap = waresDao.getAll();
//        model.addAttribute("waresMap",waresMap);
//        System.out.println(waresMap);
//        return "responsive_table";
//    }
    @RequestMapping("/waresMap")
    public String list(Model model){

        List<Wares> waresMap = waresMappper.queryWaresList();
        model.addAttribute("waresMap",waresMap);
        System.out.println(waresMap);
        return "responsive_table";

    }



    @PostMapping("/wares")
    public  String addWares(Wares wares){
        waresMappper.addWares(wares);
        return "redirect:waresMap";
    }
//    public  String addWares(Wares wares){
////
//        System.out.println(wares);
//        waresDao.save(wares);
//        return "redirect:waresMap";
//    }



//    到达修改页面
    @GetMapping("/{id}")
    public String toModify(@PathVariable("id")Integer id,Model model){
        Wares wares = waresMappper.queryWaresById(id);
//        返回商品信息
        model.addAttribute("wares",wares);

        return "modify";
    }
//
////    商品的信息的修改
    @PostMapping("/modify")
    public String modify(Wares wares){
        waresMappper.updateWares(wares);
        return "redirect:waresMap";

    }

//    @GetMapping("/{type}")
//    public String toAnalysis(@PathVariable("type")String type,Model model){
//        List<Wares> waresMap = (List<Wares>) waresMappper.queryWaresByType(type);
//        model.addAttribute("waresMap",waresMap);
//
//        return "Analysis";
//    }

//    public String modify(Wares ware){
//        waresDao.save(ware);
//        return "redirect:waresMap";
//    }



    @GetMapping("/del{id}")
    public String del(@PathVariable("id")Integer id){
        waresMappper.delete(id);
        return "redirect:waresMap";
    }

//    public String del(@PathVariable("id")Integer id){
//        waresDao.delete(id);
//        return "redirect:waresMap";
//    }
//
//
//    @GetMapping("/search{name}")
//    public String del(@PathVariable("name")String name,Model model){
//        Wares wares = waresDao.getWaresByName(name);
////        返回商品信息
//        model.addAttribute("wares",wares);
//        return "search";
//    }
}
