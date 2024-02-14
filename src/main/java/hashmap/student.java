package hashmap;


import java.util.HashMap;

public class student {
    private String firstName;
    private String lastName;
    private double GPA;

    public student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public static void main(String[] args) {
        // Creating HashMap of students
        HashMap<String, student> studentMap = new HashMap<>();
        // Adding students to the HashMap
        studentMap.put("Alice", new student("Alice", "Smith", 3.8));
        studentMap.put("Bob", new student("Bob", "Johnson", 3.9));
        studentMap.put("Charlie", new student("Charlie", "Williams", 3.5));
        // Retrieving student by name
        student student = studentMap.get("Bob");
        System.out.println("Student found: " + student.firstName + " " + student.lastName + ", GPA: " + student.GPA);
    }


}
