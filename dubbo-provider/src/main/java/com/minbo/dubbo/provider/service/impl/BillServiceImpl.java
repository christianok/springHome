package com.minbo.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.minbo.dubbo.provider.service.inf.BillService;

@Service
public class BillServiceImpl implements BillService {

    public void bill(String code) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
