package com.project.Heritage.projectHeritage;

import com.project.Heritage.projectHeritage.logging.LoggingAble;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends LoggingAble {

    @GetMapping("/")
    public String home(){
        System.out.println("HomeController");
        log.info("LOG");
        return "index";
    }

    @GetMapping("/main")
    public String main(){
        System.out.println("HomeController : main");
        return "main";
    }
}
