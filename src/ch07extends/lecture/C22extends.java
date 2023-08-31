package ch07extends.lecture;

public class C22extends {
    public static void main(String[] args) {
        MySubClass221 o1 = new MySubClass221();

    }
}

class MyClass22{
    MyClass22(){    // 기본 생성자 : 초기화 하는 코드들이 작성됨

        System.out.println("상위 클래스 초기화 코드");
    }
}

class MySubClass221 extends MyClass22{
    MySubClass221(){
        //상위 클래스 생성자호출(초기화 하는 코드) 코드 꼭 필요하다
        super();
        // (하위 클래스보다 항상) 가장 위에 꼭 있어야 함
        // 안 쓰면 자동적으로 생성 된다.
        //
        //MySubClass221 인스턴스 필드 초기화 코드들이 작성
        System.out.println("하위 클래스 초기화 코드");

    }
}