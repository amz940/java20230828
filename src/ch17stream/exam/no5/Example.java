package ch17stream.exam.no5;

import java.util.List;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {
        var list = List.of(
                "This is java book",
                "Lambda Expressions",
                "Java8 supprots lambda expressions");

//        System.out.println("고전적인 for 사용");
//        for ( String item : list){
//            if(item.toLowerCase().matches(".*java.*")){
//                System.out.println(item);
//            }
//        }

        System.out.println("contain 사용");
        list.stream()
                .filter( e->e.toLowerCase().contains("java"))
                .forEach(System.out::println);

        System.out.println(".matches 사용");
        list.stream()
                .filter(e -> e.toLowerCase().matches(".*java.*"))
                .forEach(System.out::println);

//        System.out.println("indexOf 사용");
//        list.stream()
//                .filter(s -> s.toUpperCase().indexOf("JAVA") != -1)
//                .forEach(System.out::println);
    }
}
