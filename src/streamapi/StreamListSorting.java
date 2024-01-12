package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Mango");

        // sort list in ascending order
        List<String> sortedList = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(sortedList);

        List<String> sortedList2 = sortedList.stream().sorted((s1, s2) -> s1.compareToIgnoreCase(s2)).collect(Collectors.toList());
        sortedList2.forEach(System.out::println);

        //sort list in descending order
        List<String> sortedList3 = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedList3);

        List<String> sortedList4 = fruits.stream().sorted((s1, s2) -> s2.compareToIgnoreCase(s1)).collect(Collectors.toList());
        System.out.println(sortedList4);

        //2. Sort employee by salary in ascending order
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(10,"Shreyash",30,400000));
        employees.add(new Employee(20,"Kashyap",34,500000));
        employees.add(new Employee(30,"Aryan",32,300000));
        employees.add(new Employee(40,"Kumar",29,250000));

        List<Employee> employeeSortedAscending = employees.stream().sorted(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary() - o2.getSalary();
            }
        }).collect(Collectors.toList());

        System.out.println(employeeSortedAscending);

        //sorting in descending order using lambda expression
        List<Employee> employeesSortedAscending2 = employees.stream().sorted((o1, o2) -> o2.getSalary() - o1.getSalary()).collect(Collectors.toList());
        System.out.println(employeesSortedAscending2);
    }
}
