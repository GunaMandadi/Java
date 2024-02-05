package Lists;


import java.util.ArrayList;

class Student {
    String firstName;
    String lastName;
    double gpa;

    public Student(String firstName, String lastName, double gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }
}

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Doe", 3.2));
        students.add(new Student("Jim", "Taylor", 2.9));
        students.add(new Student("Jack", "Hill", 3.8));

        double avgGpa = getAverageGPA(students);

        removeBelowAverage(students, avgGpa);

        printStudents(students);
    }

    public static double getAverageGPA(ArrayList<Student> students) {
        double sum = 0;
        for(Student s: students) {
            sum += s.gpa;
        }
        return sum/students.size();
    }

    public static void removeBelowAverage(ArrayList<Student> students, double avgGpa) {
        students.removeIf(s -> s.gpa < avgGpa);
    }

    public static void printStudents(ArrayList<Student> students) {
        for(Student s: students) {
            System.out.println(s.firstName + " " + s.lastName);
        }
    }
}