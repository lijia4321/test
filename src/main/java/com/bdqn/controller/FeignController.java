package com.bdqn.controller;

import com.bdqn.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    @RequestMapping("/testName")
    public String testName(@RequestParam String name) {
        return feignService.testName(name);
    }

    @RequestMapping("/test")
    public String testFeign() {
        return feignService.testFeign();
    }
}
