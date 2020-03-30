package org.github.geass.service;

import org.github.geass.dto.ServiceTypeA;
import org.github.geass.dto.ServiceTypeB;

// 策略模式适用的场景是只有一两个方法（一种特定的策略），如果要处理的参数不一样，通常是放到一个Context中
public interface CompanyStrategy {
    void docking(Context context);
}

class Context {
    ServiceTypeA serviceTypeA;
    ServiceTypeB serviceTypeB;

    public Context(ServiceTypeA serviceTypeA, ServiceTypeB serviceTypeB) {
        this.serviceTypeA = serviceTypeA;
        this.serviceTypeB = serviceTypeB;
    }
}

