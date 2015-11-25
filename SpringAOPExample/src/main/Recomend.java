package main;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

class Recomend implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("Before method");
    }
}
