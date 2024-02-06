package oops;

public class SubDepartment extends Department {
    private int departmentSize;


    public SubDepartment(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }

    public static void main(String[] args) {

        SubDepartment subDepartment = new SubDepartment(50);


        System.out.println("Department size: " + subDepartment.getDepartmentSize());
    }
}
