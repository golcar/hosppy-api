package com.endeavour.hosppy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping(path="/v1/diary")
public class DiaryController {
    @GetMapping()
    public Map<String,String> diary(){
        return Collections.singletonMap("msj","Diary");
    }
}
