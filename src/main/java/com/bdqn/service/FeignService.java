package com.bdqn.service;

import com.bdqn.fallback.FeignFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value="PROVIDER" , fallback = FeignFallback.class)
public interface FeignService {

    @RequestMapping("/testName")
    public String testName(@RequestParam String name);

    @RequestMapping("/test")
    public String testFeign();
}


