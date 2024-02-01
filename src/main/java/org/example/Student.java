package org.example;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student s = new Student("CIS");
        System.out.println(s.getName());
    }
}
