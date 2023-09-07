package ch13generic.lecture;

public class C11typeParameter {
    public static void main(String[] args) {
        MyClass11<Animal> o1 = new MyClass11<>();
        MyClass11<Dog> o2 = new MyClass11<>();
        MyClass11<Cat> o3 = new MyClass11<>();

    }
}

// Animal 타입의 메소드들을 안전하게 불러들이기 위해서 extends를 활용
class MyClass11<T extends Animal>{
    public void method(T param){
        param.equals(null);
        param.toString();
        param.hashCode();
        param.animalMethod();
    }
}
