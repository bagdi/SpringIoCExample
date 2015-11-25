package main;

import org.springframework.aop.ThrowsAdvice;

public class RecomendThrows implements ThrowsAdvice {

    public void afterThrowing(Exception e) {
        System.out.println("Generate an exception");
    }
}
