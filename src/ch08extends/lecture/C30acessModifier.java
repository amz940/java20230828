package ch08extends.lecture;

public class C30acessModifier {
    public static void main(String[] args) {
        //public : 가장 넓은 범위, 어디서든지 접근 가능
        //protected : 같은 패키지 내 + 다른 패키지에 있는 상속한(자식) 클래스 에서 접근 가능
        //(package private , default ) : 같은 패키지 내에서만 접근 가능
        //private : 가장 좁은 범위, 클래스 내에서만 접근 가능

        MyClass30 o1 = new MyClass30();
        o1.publicMethod();
//        o1.privateMethod(); // 접근 불가
        o1.packagePrivateMethod();
        o1.protectedMethod();
    }

}

