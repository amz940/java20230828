package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C04forEach {
    public static void main(String[] args) {
        List<MyClass04> list = new ArrayList<>();
        list.add(new MyClass04("홍"));
        list.add(new MyClass04("길"));
        list.add(new MyClass04("동"));

        list.forEach(System.out::println);
    }
}

class MyClass04{
    private String name;

    public MyClass04(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "name = " + name;

    }
}