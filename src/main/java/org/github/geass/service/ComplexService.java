package org.github.geass.service;

import org.github.geass.dto.ServiceTypeA;
import org.github.geass.dto.ServiceTypeB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ComplexService {

    @Autowired
    private EmotionDocking docking;

    @Autowired
    private CompanyBeeStrategy beeStrategy;

    Map<String, CompanyStrategy> strategies = new HashMap<>();

    public void init() {
        strategies.put("竹间", docking);
        strategies.put("厂商2", beeStrategy);
    }

    //原业务代码
    public void complexSomething() {
        System.out.println("做一些复杂的业务处理");
        String readFromDatabase = "竹间";
        switch (readFromDatabase) {
            case "竹间":
                System.out.println("执行对应的处理");
                break;
            case "厂商2":
                System.out.println("执行对应的处理");
                break;
            //后续会根据情况增加很多个不同的case处理
            default:
                break;
        }
    }

    //我尝试用策略模式改造原有代码,没有想到如何以多态来实现,以省略switch的选择
    public void tryToCompaynStrategy() {
        ServiceTypeA dataA = new ServiceTypeA();
        ServiceTypeB dataB = new ServiceTypeB();
        System.out.println("做一些复杂的业务处理");
        String readFromDatabase = "竹间";
        strategies.getOrDefault(readFromDatabase, new CompanyStrategy() {
            @Override
            public void docking(Context context) {
                throw new IllegalStateException("Unknown strategy: " + readFromDatabase);
            }
        }).docking(new Context(dataA, dataB));
    }

    //这里使用枚举的方式来替代switch
    public void tryToEnum() {
        ServiceTypeA dataA = new ServiceTypeA();
        ServiceTypeB dataB = new ServiceTypeB();
        System.out.println("做一些复杂的业务处理");
        String readFromDatabase = "竹间";

        TryEnum.valueOf(readFromDatabase).docking(new Context(dataA, dataB));
    }
}
