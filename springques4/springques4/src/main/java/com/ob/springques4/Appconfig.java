package com.ob.springques4;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Foodconfig.class, Drinksconfig.class})
public class Appconfig {

}

