package org.github.geass.service;

import org.github.geass.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest(classes = Application.class)
@RunWith(SpringRunner.class)
public class ComplexServiceTest {

    @Autowired
    private ComplexService service;

    @Test
    public void complexSomething() {
        service.complexSomething();
    }

    @Test
    public void tryToCompaynStrategy() {
        service.tryToCompaynStrategy();
    }

    @Test
    public void tryToEnum() {
        service.tryToEnum();
    }
}