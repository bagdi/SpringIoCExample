package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args) throws Exception {
        ApplicationContext aptx = new ClassPathXmlApplicationContext("resource/spring-config.xml");
        Single single = (Single) aptx.getBean("proxy");

        System.out.println(single.getStr());
    }
}
