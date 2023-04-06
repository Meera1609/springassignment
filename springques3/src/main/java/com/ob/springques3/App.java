package com.ob.springques3;

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
       ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
       Propcollection prop = (Propcollection) context.getBean("Propcollection");
       System.out.println(prop.getAddress())
       ;
    }
}
