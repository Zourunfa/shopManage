package com.example.springbootweb.Dao;

import com.example.springbootweb.pojo.Department;
import com.example.springbootweb.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工dao
@Repository
public class GoodsDao {
//    模拟数据库中的操作
    private  static Map<Integer, Goods> goodsArr;
//    员工有所属的部门

    static{
        goodsArr = new HashMap<Integer, Goods>();//
        goodsArr.put(1001,new Goods(1,"apple",20,"fruit",1000,20,"熊梓淇"));
        goodsArr.put(1002,new Goods(2,"banana",10,"fruit",200,10,"熊梓淇"));
        goodsArr.put(1003,new Goods(3,"computer",5000,"e-goods",12000,365,"刘辉"));
        goodsArr.put(1004,new Goods(4,"phone",2000,"e-goods",10300,365,"刘辉"));
        goodsArr.put(1005,new Goods(5,"keyboard",200,"e-goods",10400,500,"刘辉"));

    }
//    主键自增
    private static  Integer initId = 1006;

//    增加一个员工
    public void  save(Goods goods){
        if(goods.getId()==null){
            goods.setId(initId++);
        }
        goodsArr.put(goods.getId(),goods);
    }
//    查询全goodsArr
    public Collection<Goods> getAll(){
        return goodsArr.values();
    }

//    通过id查询员工
    public Goods getEmployeeById(Integer id){
        return goodsArr.get(id);
    }

//    删除员工通过id
    public  void delete(Integer id){
        goodsArr.remove(id);
    }

}
