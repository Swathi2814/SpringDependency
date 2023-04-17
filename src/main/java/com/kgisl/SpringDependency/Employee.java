package com.kgisl.SpringDependency;

public class Employee {
    private int id;
    private String name;
   static{
    System.out.println("model static block");
   }
    public Employee() {
        System.out.println("def cons");
    }
    public Employee(int id) {
        System.out.println("int cons");
        this.id = id;
    }
    public Employee(String name) {
        System.out.println("string cons");
        this.name = name;
    }
    public Employee(int id, String name) {
        System.out.println("both cons");
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    void show(){  
        System.out.println(id+" "+name);  
    }  
}