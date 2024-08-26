package com.project.Heritage.projectHeritage.user.dao;

import com.project.Heritage.projectHeritage.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserDAO {

    @Autowired
    private UserMapper userMapper;

    public List findAllusers(){
        System.out.println("DAO");

            System.out.println(userMapper.findAllUser());


        System.out.println("DAO");
        return userMapper.findAllUser();
    }
}
