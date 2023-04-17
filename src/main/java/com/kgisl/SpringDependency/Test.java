package com.kgisl.SpringDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Test {

    static {
        System.out.println("controller static block");
    }

    @RequestMapping("/")
    public String sample() {  
            
        // ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Employee s = context.getBean("a", Employee.class);
        // s.show();
        // Employee s1 = context.getBean("b", Employee.class);
        // s1.show();
        // Employee s2 = context.getBean("c", Employee.class);
        // s2.show();
        // Employee s3 = context.getBean("d", Employee.class);
        // s3.show();
        // Employee s4 = context.getBean("e", Employee.class);
        // s4.show();
        ApplicationContext ct = new AnnotationConfigApplicationContext(SpringConfig.class);
        SpringConfig r = ct.getBean(SpringConfig.class);
        System.out.println(r.e().getName());
        System.out.println(r.e().getId());
        return "index";
        
    }

}
