package Lists;


import java.util.ArrayList;

public class ArrayListToArray {

    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");


        String[] stringArray = new String[stringList.size()];
        stringArray = stringList.toArray(stringArray);


        System.out.println("Array elements:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}

