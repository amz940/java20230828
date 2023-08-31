package ch07extends.book.sec07.exam9;

public class Parent {
    String name;

    Parent(String name){
        this.name = name;
    }
}

class Child extends Parent{
    int studentNo;
    Child(String name, int studentNo){
        super(name);
        this.name =name;
        this.studentNo = studentNo;
    }
}
