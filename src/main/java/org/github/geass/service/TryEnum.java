package org.github.geass.service;

import org.github.geass.dto.ServiceTypeA;
import org.github.geass.dto.ServiceTypeB;

//用汉字貌似不合适,但为了和数据库读取数据匹配...
public enum TryEnum implements CompanyStrategy{

    竹间{
        @Override
        public void docking(ServiceTypeA a) {
            System.out.println("获得对应参数A,执行对应的处理");
        }

        @Override
        public void docking(ServiceTypeB a) {
            //被迫覆盖这个方法
            throw new RuntimeException("方法调用错误");
        }
    },
    厂商2{
        @Override
        public void docking(ServiceTypeA a) {
            //被迫覆盖这个方法
            throw new RuntimeException("方法调用错误");
        }

        @Override
        public void docking(ServiceTypeB a) {
            System.out.println("获得对应参数B,执行对应的处理");
        }
    }
}
