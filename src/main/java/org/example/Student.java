package org.example;
public class Student {
    private final String name;

    public Student() {
        this.name = "name";
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s= new Student();
        System.out.println(s.getName());

    }

    }

