package org.geass.parent;

import org.geass.child.ChildStaticClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentMainClass {
    public static void main(String[] args) {
        ChildStaticClass.run();
        SpringApplication.run(ParentMainClass.class, args);
    }
}
