package lambdas;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public Map<Integer, List<String>> groupStringsByLength(List<String> strings) {
        return strings.stream()
                .collect(Collectors.groupingBy(String::length)); // Group strings by their length
    }
}
