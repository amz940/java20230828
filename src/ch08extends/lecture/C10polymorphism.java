package ch08extends.lecture;

public class C10polymorphism {
    public static void main(String[] args) {
        Malamute10 dog1 = new Malamute10();
        Chihuahua10 dog2 = new Chihuahua10();

        Canidae10 can1 = dog1;
        Canidae10 can2 = dog2;

        Animal10 ani1 = dog1;
        Animal10 ani2 = dog2;

//        dog1 = ani1; // not yes
        dog1.breath();
        dog1.cry();
        ani1.cry();

        dog2.breath();
        dog2.cry();
        ani2.cry();
    }
}

class Animal10{
    void breath(){
        System.out.println("숨쉬다");
    }
    void cry(){
        System.out.println("동물이 운다");
    }
}

class Canidae10 extends Animal10{

}

class Malamute10 extends Canidae10{
    void cry(){
        System.out.println("왈왈 운다");
    }
}
class Chihuahua10 extends Canidae10{
    void cry(){
        System.out.println("멍멍 운다");
    }
}