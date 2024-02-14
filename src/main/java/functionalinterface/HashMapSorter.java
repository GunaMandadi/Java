package functionalinterface;


import java.util.*;

// HashMapSorter.java
public class HashMapSorter {
    public static <K extends Comparable<? super K>, V> Map<K, V> sortHashMapByKey(HashMap<K, V> hashMap) {
        TreeMap<K, V> sortedMap = new TreeMap<>(hashMap);
        return sortedMap;
    }
}
