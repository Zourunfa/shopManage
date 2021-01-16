package com.example.springbootweb.Dao;

import com.example.springbootweb.pojo.Wares;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class WaresDao {
//    模拟数据库中的操作
    private static Map<Integer, Wares> waresMap;

    static {
        waresMap = new HashMap<Integer,Wares>();
        waresMap.put(1,new Wares(1,"apple",20,"fruit"));
        waresMap.put(2,new Wares(2,"apple",20,"fruit"));
        waresMap.put(3,new Wares(3,"apple",20,"fruit"));
        waresMap.put(4,new Wares(4,"apple",20,"fruit"));
        waresMap.put(5,new Wares(5,"apple",20,"fruit"));
        waresMap.put(6,new Wares(6,"apple",20,"fruit"));
        waresMap.put(7,new Wares(7,"apple",20,"fruit"));

    }

//    主键自增
    private  static  Integer initId = 8;
//    增加一个员工
    public void save(Wares wares){
        if(wares.getId() == null){
            wares.setId(initId++);
        }
        waresMap.put(wares.getId(),wares);
    }
//    查询商品
    public Collection<Wares> getAll(){
        return waresMap.values();
    }

//    通过id查询员工
    public Wares getWaresById(Integer id){
        return waresMap.get(id);
    }
//public 删除员工id
    public  void delete(Integer id){
        waresMap.remove(id);
    }
//   通过name查询员工
    public Wares getWaresByName(String name){
        return waresMap.get(name);
    }


}
