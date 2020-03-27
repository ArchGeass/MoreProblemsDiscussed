package org.github.geass.service;

import org.github.geass.dto.ServiceTypeA;
import org.github.geass.dto.ServiceTypeB;

//我尝试使用策略模式进行改造
public interface CompanyStrategy {

    void docking(ServiceTypeA a);

    void docking(ServiceTypeB a);
    //之后会添加更多吧,如果有必要,如果这种改造方式是正确的...
    //理想的方式应该只有一个method,或者没必要覆盖自己不需要的method,或者这个interface本身是否有必要存在呢?
}
