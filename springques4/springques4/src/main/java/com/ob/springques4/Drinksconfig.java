package com.ob.springques4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Drinksconfig {
 @Bean
 public Cocacola getcocacola() {
	 return new Cocacola();
 }
 
 @Bean
 public Milkshake getmilkshake() {
	 return new Milkshake();
 }
	
}
