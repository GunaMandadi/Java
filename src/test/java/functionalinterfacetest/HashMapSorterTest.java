package functionalinterfacetest;


import functionalinterface.HashMapSorter;
import org.junit.Test;
        import java.util.HashMap;
        import java.util.Map;
        import static org.junit.Assert.*;

public class HashMapSorterTest {
    @Test
    public void testSortHashMapByKey() {
        // Test case with Integer keys
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(3, "apple");
        hashMap.put(1, "banana");
        hashMap.put(2, "orange");
        Map<Integer, String> sortedMap = HashMapSorter.sortHashMapByKey(hashMap);
        assertEquals("{1=banana, 2=orange, 3=apple}", sortedMap.toString());
    }
}
