package ch16lambda.book.sec5.exam3;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

//        Member m1 = person.getMember1(id -> new Member(id));
        Member m1 = person.getMember1(Member:: new);
        System.out.println(m1);
        System.out.println();

//        Member m2 = person.getMember2((id, name) -> new Member(id, name));
        Member m2 = person.getMember2(Member::new);
        System.out.println(m2);
    }
}
