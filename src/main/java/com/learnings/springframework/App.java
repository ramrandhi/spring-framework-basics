package com.learnings.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	ApplicationContext context = 
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = context.getBean(Alien.class);
        alien.code();
        System.out.println(alien.getAge());
    }
}
