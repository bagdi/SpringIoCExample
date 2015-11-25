package main;

import org.springframework.aop.AfterReturningAdvice;
import java.lang.reflect.Method;

public class RecomendAfter implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("After method");
    }
}
