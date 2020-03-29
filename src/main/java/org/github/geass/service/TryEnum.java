package org.github.geass.service;

//用汉字貌似不合适,但为了和数据库读取数据匹配...
public enum TryEnum implements CompanyStrategy {

    竹间 {
        @Override
        public void docking(Context context) {
            System.out.println("获得对应参数A,执行对应的处理" + context.serviceTypeA);
        }
    },
    厂商2 {
        @Override
        public void docking(Context context) {
            System.out.println("获得对应参数A,执行对应的处理" + context.serviceTypeB);
        }
    }
}
