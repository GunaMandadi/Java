package maps;


import java.util.HashMap;

class Student {
    String firstName;
    String lastName;
    double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

public class StudentHashMap {

    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();
        studentMap.put("John", new Student("John", "Doe", 3.5));
        // Add more students here...

        String studentName = "Alice";
        Student student = studentMap.get(studentName);

        System.out.println(student != null ? "Student found: " + student : "Student not found with name: " + studentName);
    }
}
