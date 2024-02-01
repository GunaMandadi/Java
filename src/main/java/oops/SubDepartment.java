package oops;

// Subclass extending Department
public class SubDepartment extends Department {
    private int departmentSize;

    // Constructor
    public SubDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    // Implementation of abstract method
    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    // Main method to run
    public static void main(String[] args) {
        // Create an object of SubDepartment
        SubDepartment subDepartment = new SubDepartment(50);

        // Call the getDepartmentSize method and print the result
        System.out.println("Department size: " + subDepartment.getDepartmentSize());
    }
}
