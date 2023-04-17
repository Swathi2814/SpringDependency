package com.kgisl.SpringDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    static{
        System.out.println("config static block");
    }
    @Autowired
    public Employee emp;
    @Bean
    public Employee e(){
        //emp=new Employee(1, null);
        emp=new Employee();
        emp.setId(2);
        emp.setName("Jane");
        return emp;
    }

}
