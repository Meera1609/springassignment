package com.ob.springques4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Foodconfig {
@Bean
public Briyani getBriyani() {
	return new Briyani();
}
@Bean
public Friedrice getfriedrice() {
	return new Friedrice();
}
}
