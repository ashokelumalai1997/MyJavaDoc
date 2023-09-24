import java.util.*;
import java.util.stream.Collectors;
/*
Stream Operations: Now, perform the following Stream operations on the collection:

a. Filter: Use filter to select even numbers from the list.

b. Map: Use map to square each number in the list.

c. Reduce: Use reduce to find the sum of all squared numbers.

d. Collect: Use collect to gather the squared numbers into a new list.

e. ForEach: Use forEach to print each squared number.

f. Count: Use count to count the total number of squared numbers.

g. Min/Max: Use min and max to find the minimum and maximum squared numbers.

h. Distinct: Use distinct to get unique squared numbers.

i. Sort: Use sorted to sort the squared numbers in ascending order.

j. Any/All/None Match: Use anyMatch, allMatch, and noneMatch to check if any, all, or none of the squared numbers meet a specific condition.
*/

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Double> ab = numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).reduce((x,y)->x+y);
        System.out.println(ab.orElse(0.0));

        List<Double> listD = numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).collect(Collectors.toList());
        listD.forEach(System.out::println);
        listD.forEach(a->System.out.println(a));

        long c = numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).count();
        System.out.println(c);
        Optional<Double> min = numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).min(Double::compare);
        Optional<Integer> minInt = numbers.stream().filter(a->a%2==0).max(Integer::compare);
        System.out.println(minInt.get());
        numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).distinct().sorted((a,b)->Double.compare(b,a)).forEach(System.out::println);
        Boolean ba = numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).distinct().sorted((a,b)->Double.compare(b,a)).noneMatch(a-> a%101==0);
        Boolean ba = numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).distinct().sorted((a,b)->Double.compare(b,a)).anyMatch(a-> a%101==0);
        Boolean ba = numbers.stream().filter(a->a%2==0).map(x->Math.pow(x,2)).distinct().sorted((a,b)->Double.compare(b,a)).allMatch(a-> a%101==0);
        System.out.println(ba);

    }
}