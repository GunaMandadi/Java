package lambdas;


import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct() // Remove duplicates
                .collect(Collectors.toList()); // Collect the distinct elements into a list
    }
}
