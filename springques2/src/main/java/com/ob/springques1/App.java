package com.ob.springques1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");
       Creature earth = (Creature) context.getBean(Creature.class);
       earth.creatureName();
       earth.creatureType();
    }
}
