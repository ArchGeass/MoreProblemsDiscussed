package org.github.geass.service;

import org.github.geass.dto.ServiceTypeA;
import org.github.geass.dto.ServiceTypeB;
import org.springframework.stereotype.Service;

@Service
public class EmotionDocking implements CompanyStrategy {
    @Override
    public void docking(ServiceTypeA a) {
        System.out.println("获得对应参数A,执行对应的处理");
    }

    @Override
    public void docking(ServiceTypeB a) {
        //被迫覆盖这个方法
        throw new RuntimeException("方法调用错误");
    }
}
