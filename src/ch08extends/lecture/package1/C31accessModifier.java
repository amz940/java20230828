package ch08extends.lecture.package1;

import ch08extends.lecture.MyClass30;

public class C31accessModifier {
    public static void main(String[] args) {
        MyClass30 o1 = new MyClass30();
//        o1.privateMethod(); //안됨
        o1.publicMethod(); // 가능
//        o1.packagePrivateMethod(); // 안됨 -> 패키지가 달라져서
//        o1.protectedMethod(); // 안됨 -> 패키지가 달라서
    }
}
