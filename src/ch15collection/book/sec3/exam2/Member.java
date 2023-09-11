package ch15collection.book.sec3.exam2;

import java.util.Objects;

public class Member {
    public String name;
    public int age;

    public Member(String name, int age){
        this.name =name;
        this.age = age;
    }

    public int hashCode(){
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Member member = (Member) object;
        return age == member.age && Objects.equals(name, member.name);
    }
}
