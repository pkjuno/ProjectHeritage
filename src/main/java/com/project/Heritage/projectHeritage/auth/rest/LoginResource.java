package com.project.Heritage.projectHeritage.auth.rest;

import com.project.Heritage.projectHeritage.logging.LoggingAble;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/auth")
public class LoginResource extends LoggingAble {


    @RequestMapping(value = "/loginProcess", method = RequestMethod.PUT)
    public Map loginProcess(){
        Map<String, Object> resultMap = new HashMap<>();



        return resultMap;
    }

    @RequestMapping(value="/logoutProcess", method = RequestMethod.POST)
    public void logoutProcess(){

    }

    @RequestMapping(value = "/kakao/loginProcess", method = RequestMethod.GET)
    public Map kakaoLogin(){
        Map<String, Object> resultMap = new HashMap<>();

        log.info("카카오로그인");


        return resultMap;
    }
}
