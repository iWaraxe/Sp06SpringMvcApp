package com.coherentsolutions.spring.school.section22;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMvcApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(WebConfigJSP.class, WebConfigThymeleaf.class);
        System.out.println("Spring MVC Application Context initialized.");
    }
}
