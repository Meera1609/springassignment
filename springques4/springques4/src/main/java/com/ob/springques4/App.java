package com.ob.springques4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);
        Briyani prop = (Briyani) context.getBean(Briyani.class);
        prop.eatBriyani();
       
        	
        		
        		
    }
}
