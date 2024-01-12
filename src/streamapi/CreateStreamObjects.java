package streamapi;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreamObjects {
    public static void main(String[] args) {
        //1. create a stream
        Stream<String> stream1 = Stream.of("a","b","c");
        stream1.forEach(System.out::println);

        //2. create a stream from sources
        Collection<String> collection = Arrays.asList("JAVA","J2EE","Spring","Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List<String> list = Arrays.asList("JAVA","JAVA","J2EE","Spring","Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);

        String[] strArray = {"A","B","C"};
        Stream<String> stream5 = Arrays.stream(strArray);
        stream5.forEach(System.out::println);
    }
}
