package com.endeavour.hosppy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path="/login")
public class LoginController {
    @GetMapping("/singIn")
    public Map<String,String> singIn(){
        return Collections.singletonMap("msj","SING IN");
    }

}
