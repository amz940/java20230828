package ch15collection.lecture;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C11equals {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("java");
        System.out.println("set.size() = " + set.size());

        Set<MyClass11> set2 = new HashSet<>();
        set2.add(new MyClass11("흥민"));
        set2.add(new MyClass11("흥민"));
        System.out.println("set2.size() = " + set2.size());
    }
}

class MyClass11{
    private String name;

    public MyClass11(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        MyClass11 myClass11 = (MyClass11) object;
        return Objects.equals(name, myClass11.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
