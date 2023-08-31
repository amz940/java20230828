package ch07extends.lecture;

public class C19polymorphism {
    public static void main(String[] args) {
        Hero19 myHero = new Hero19();
        myHero.weapon = new Gun();
        myHero.attack();

        myHero.weapon = new Sword();
        myHero.attack();

    }
}

class Hero19 {
    Weapon weapon;

    public void attack(){
        weapon.shot();
    }
}

class Weapon{
    void shot(){
        System.out.println("무기를 사용합니다");
    }
}

class Gun extends Weapon{
    void shot(){
        System.out.println("총을 쏩니다");
    }
}
class Sword extends Weapon{
    void shot(){
        System.out.println("검을 휘두릅니다");
    }
}