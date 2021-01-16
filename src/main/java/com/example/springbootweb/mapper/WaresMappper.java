package com.example.springbootweb.mapper;

import com.example.springbootweb.pojo.User;
import com.example.springbootweb.pojo.Wares;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface WaresMappper {

    List<Wares> queryWaresList();

    Wares queryWaresById(int id);

    List<Wares> queryWaresByType(String type);

    Wares queryWaresByName(String name);

    Object addWares(Wares wares);

    Object updateWares(Wares wares);

    Object delete(int id);

}
