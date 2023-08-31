package ch08extends.lecture.package1;

import ch08extends.lecture.MyClass30;

public class MySubClass30 extends MyClass30 {
    public void someMethod(){
        super.publicMethod();
        super.protectedMethod();    // 상속 받아서 사용 가능
//        super.privateMethod(); // 안됨
//        super.packagePrivateMethod(); // 안됨

    }

}
