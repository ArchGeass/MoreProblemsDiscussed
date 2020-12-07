package org.geass.parent;

import org.geass.child.ChildStaticClass;

//@SpringBootApplication
public class ParentMainClass {
    public static void main(String[] args) {
        ChildStaticClass.run();
//        SpringApplication.run(ParentMainClass.class, args);
    }
}
