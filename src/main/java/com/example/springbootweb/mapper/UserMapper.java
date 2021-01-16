package com.example.springbootweb.mapper;

import com.example.springbootweb.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();

//    User queryUserById(int id);

    User queryUserByName(String username);

//    int addUser(User user);

//    int updateUser(User user);

//    int delete(int id);


}
