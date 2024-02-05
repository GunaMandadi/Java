package strings;


public class StringRotationChecker {

    public static boolean isRotation(String str1, String str2) {
        // Check if lengths are equal and not empty
        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }

        // Concatenate str1 with itself, if str2 is substring of it, then str2 is rotation of str1
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        if (isRotation(str1, str2)) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }
}
