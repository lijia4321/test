package com.bdqn.fallback;

import com.bdqn.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignFallback implements FeignService{
    @Override
    public String testName(String name) {
        return "出错2";
    }

    @Override
    public String testFeign() {
        return "出错1";
    }
}