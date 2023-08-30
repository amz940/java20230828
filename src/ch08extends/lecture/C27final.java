package ch08extends.lecture;

public class C27final {
    public static void main(String[] args) {
       final int a = 3;
//       a = 4; // final 변수 : 값을 한 번만 할당 할 수 있다.
    }
}

class MyClass27{
    final int age = 3;
    final String name;

    MyClass27(){
        this.name = "java";
    }

    MyClass27(String name){
        this.name = name;
    }

}