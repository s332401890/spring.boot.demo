package com.boss.shen.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("${webapp.contextpath}")
public class SampleController {

	@Value("${webapp.name}")
	private String webappName;
	
	@Value("${webapp.contextpath}")
	private String contextPath;
	
    @RequestMapping("/test")
    @ResponseBody	
    String test() {
        return webappName + contextPath;
    }

}