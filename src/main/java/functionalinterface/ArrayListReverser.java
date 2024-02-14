package functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ArrayListReverser.java
public class ArrayListReverser {
    public static <T> void reverse(ArrayList<T> list) {
        Collections.reverse(list);
    }
}

