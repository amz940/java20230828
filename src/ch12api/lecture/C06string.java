package ch12api.lecture;

public class C06string {
    public static void main(String[] args) {
        String o1 = new String("java");
        String o2 = new String("spring");
        String o3 = new String("java");

        System.out.println(o1 == o2); // false
        System.out.println(o1.hashCode());
        System.out.println(o2.hashCode());

        System.out.println(o1 == o3);
        System.out.println(o1.hashCode());
        //hashCode 는 주소값이랑 상관없이  실제 인스턴스값을 호출한다
        System.out.println(o3.hashCode());
    }
}
