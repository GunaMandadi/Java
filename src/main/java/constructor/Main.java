package constructor;


class Parent {
    int parentVariable;

    Parent(int parentVariable) {
        this.parentVariable = parentVariable;
    }
}

class Child extends Parent {
    int childVariable;

    Child(int parentVariable, int childVariable) {
        super(parentVariable);
        this.childVariable = childVariable;
    }

    Child(int childVariable) {
        super(0); // Assuming a default value for parentVariable
        this.childVariable = childVariable;
    }
}

public class Main {
    public static void main(String[] args) {
        Child child1 = new Child(10, 20);
        Child child2 = new Child(30);

        System.out.println("Child 1 - Parent Variable: " + child1.parentVariable + ", Child Variable: " + child1.childVariable);
        System.out.println("Child 2 - Parent Variable: " + child2.parentVariable + ", Child Variable: " + child2.childVariable);
    }
}
