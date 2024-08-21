package com.project.Heritage.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final Logger log =LogManager.getLogger(HomeController.class);

    @GetMapping("/")
    public String home(){
        System.out.println("HomeController");
        log.info("로그그그그그극그");
        return "index";
    }

    @GetMapping("/main")
    public String main(){
        System.out.println("HomeController");
        log.info("로그그그그그극그");
        return "main";
    }
}
