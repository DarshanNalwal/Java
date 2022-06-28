package com.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPractice {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("John",21,"Male");
        Employee e2 = new Employee("Martin",19,"Male");
        Employee e3 = new Employee("Mary",31,"Female");
        Employee e4 = new Employee("Stephan",18,"Male");
        Employee e5 = new Employee("Gary",26,"Male");

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        maximumAge(employeeList);
        joinNames(employeeList);
        groupByEmpName(employeeList);

        Integer[] arr = new Integer[]{1,2,3,4,3,2,4,2};
        List<Integer> listWithDuplicates = Arrays.asList(arr);
        removeDuplicatesFromArray(listWithDuplicates);

        Integer[] arr2 = new Integer[]{100,24,13,44,114,200,40,112};
        List<Integer> list = Arrays.asList(arr2);
        findAverage(listWithDuplicates);
        getTwoListBasedOnCondition(employeeList);
        getAverageAgeByGender(employeeList);

    }

    static void maximumAge(List<Employee> employeeList){
        System.out.println("Maximum age is : "+employeeList.stream().mapToInt(Employee::getAge).max().getAsInt());
    }

    static void sortByAge(List<Employee> employeeList){
        System.out.println("Employees sorted by age : ");
        employeeList.stream().sorted((a,b) -> a.getAge() - b.getAge()).forEach(System.out::println);
    }

    static void joinNames(List<Employee> employeeList){
        System.out.println("names of all employees : ");
//        String empnames = employeeList.stream().map(Employee::getName).collect(Collectors.joining(","));
        List<String> empNames = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        String empNamesAppended = String.join(",", empNames);
        System.out.println(empNamesAppended);
    }

    static void removeDuplicatesFromArray(List<Integer> dupList){
        dupList.stream().distinct().forEach(System.out::println);
    }

    static void findAverage(List<Integer> list){
        System.out.println(list.stream().mapToInt(n -> n*n).filter(l -> l > 10000).average().getAsDouble());
    }

    static void getTwoListBasedOnCondition(List<Employee> employeeList){
        Map<Boolean, List<Employee>> returnedValue = employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        returnedValue.entrySet().forEach((list -> {
            System.out.println("Key is : "+list.getKey());
            list.getValue().forEach(e -> System.out.println(e.toString()));
        }));
    }

    static void getAverageAgeByGender(List<Employee> employeeList){
        Map<String, Double> avgAgeByGender = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        avgAgeByGender.entrySet().forEach(entry -> System.out.println("Gender : "+entry.getKey()+" Average age : "+entry.getValue()));
    }

    static void groupByEmpName(List<Employee> employeeList){
        Map<String, List<Employee>> grouped = employeeList.stream().collect(Collectors.groupingBy(e -> e.getName()));
        grouped.forEach((k,v) -> System.out.println("Name : "+k+" ==> "+v));
    }
}
