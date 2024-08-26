package com.project.Heritage.projectHeritage.user.controller;

import com.project.Heritage.projectHeritage.logging.LoggingAble;
import com.project.Heritage.projectHeritage.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class UserController extends LoggingAble {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public void getUserInfo(){
        System.out.println("CONTROLLER");
        log.info("LOG");
        userService.allUsers();
    }

    @GetMapping("/myPage")
    public String myPage(){
        return "user/myPage";
    }
}
