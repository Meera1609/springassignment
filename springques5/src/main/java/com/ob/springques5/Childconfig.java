package com.ob.springques5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Childconfig {
  @Bean
  public Child getChild() {
	  Child child = new Child();
	  child.setName("meera");
      child.setAge(21);
      child.setGender("fenale");
      child.setStandard(9);
      child.setHobbies(Arrays.asList("singing", "Dancing", "Playing "));
      child.setSubjectsStudying(new HashSet<>(Arrays.asList("tamil", "Maths", "Science")));
      child.setFriendsAndGender(new HashMap<String, String>() {{
         put("Sarah", "female");
         put("Mike", "male");
      }});
     
      child.setPet(getCat()); 	
      return child;
  }
  @Bean
  public Dog getDog() {
	  return new Dog();
  }
  public Cat getCat() {
	  return new Cat();
  }
  public Cow getCow() {
	  return new Cow();
  }
}
