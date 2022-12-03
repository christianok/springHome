package com.minbo.dubbo.provider.service.impl;

import com.minbo.dubbo.provider.service.inf.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    public String doing() {
        return "hello this is from me";
    }
}
