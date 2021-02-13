package com.desai.ConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach=context.getBean("myCoach",Coach.class);
       theCoach.getDailyWorkOut();
      System.out.println( theCoach.getDailyFortune());
       context.close();
    }
}
