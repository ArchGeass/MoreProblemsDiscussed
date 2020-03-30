package org.github.geass.service;

import org.springframework.stereotype.Service;

@Service
public class CompanyBeeStrategy implements CompanyStrategy {
    @Override
    public void docking(Context context) {
        System.out.println("获得对应参数B,执行对应的处理" + context.serviceTypeB);
    }
}
