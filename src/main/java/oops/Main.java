package oops;


abstract class Department {
    public abstract int getDepartmentSize();
}

class SubDepartment extends Department {
    private int size;

    public SubDepartment(int size) {
        this.size = size;
    }

    @Override
    public int getDepartmentSize() {
        return size;
    }
}

public class Main {
    public static void main(String[] args) {
        SubDepartment subDept = new SubDepartment(20);
        int departmentSize = subDept.getDepartmentSize();
        System.out.println("Department size: " + departmentSize);
    }
}
