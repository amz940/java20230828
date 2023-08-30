package ch08extends.book.sec07.exam11;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();

        //매개변수의 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    static void animalSound(Animal animal) {
        animal.sound();
    }
}
