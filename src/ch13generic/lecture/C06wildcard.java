package ch13generic.lecture;

public class C06wildcard {
    public static void main(String[] args) {
        // 매우 어렵다
        // 그냥 이런게 있다구만 하고 넘겨라
        Dog d = new Dog();
        Animal a1 = d;
        Cat c = new Cat();
        Animal a2 = c;

        MyClass06<Dog> o1 = new MyClass06<>();
//        MyClass06<Animal> o2 = o1;
        // o2의 제네릭이 애니멀  근데 o1의 제네릭이 도그 여서 도그 = 애니멀이 안된다
//        o2.set(new Animal());

        MyClass06<? extends Animal> o3 = o1;
        // extends : Animal이 가지고 있는 데이터를 나눠준 자식클래스들을 불러온다\
        // 보통 get , 어떤 데이터를 줄 때 쓴다
        // o1의 타입은 My6<Dog>, <Cat> , <Animal> 일수가 있다
        MyClass06<? extends Animal> o4 = new MyClass06<Animal>();
        MyClass06<? extends Animal> o5 = new MyClass06<Dog>();
        MyClass06<? extends Animal> o6 = new MyClass06<Cat>();
//        MyClass06<? extends Animal> o7 = new MyClass06<Object>();

        Animal ani1 = o3.get(); // 데이터 in
        // T가 animal 타입이니까 animal로 받는게 안전
//        o3.set(new Dog()); // 안전하지 않다. Dog, Animal 일땐 괜찮은데
//                              Cat이 오면 오류라서 오류를 뛰운다
//        o5.set(new Dog());
//        o6.set(new Cat());
        ani1.animalMethod();

        MyClass06<? super Animal> o8 = new MyClass06<Animal>();
        MyClass06<? super Animal> o9 = new MyClass06<Object>();
        // super : Animal한테 데이터를 준 부모클래스들을 불러온다
        // 보통 set , 어떤 데이터를 받을 때 쓴다
//        MyClass06<? super Animal> o10 = new MyClass06<Dog>(); // x
        o8.set(new Dog());  // 데이터 out
        o8.set(new Cat());
//        o8.set(new Object()); // Object는 부모
        o9.set(new Animal());
    }
}

class Animal {
    public void animalMethod(){

    }
}
class Dog extends Animal{

}
class Cat extends Animal{

}
class MyClass06<T>{
    public void set(T param){}
    public T get(){
        return null;
    }
}
