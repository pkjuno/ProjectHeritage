package com.project.Heritage.projectHeritage.user.service;

import com.project.Heritage.projectHeritage.user.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private  UserDAO userDAO;

    public List allUsers(){
        System.out.println("SERVICE");
        return userDAO.findAllusers();
    }
}
