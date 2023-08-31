package ch08interface.lecture;

public class C06polymorhism {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setWeapon(new Gun()); // new Gun()은 뭔지
        hero.attck();

        hero.setWeapon(new Bow());
        hero.attck();
    }
}

class Hero{
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void attck(){
        weapon.trigger();
    }
}

interface Weapon{
    void trigger();
}

class Gun implements Weapon{
    @Override
    public void trigger(){
        System.out.println("총을 쏩니다.");
    }
}
class Bow implements Weapon{
    public void trigger(){ // 왜 public을 써야 하는지?
                    // 부모인 타입이 interface인데 interface는 public을 기본적으로 탑재 해서
                    // 자식클래스가 public보다 더 낮은 접근제어자를 쓸수 없다
        System.out.println("활을 쏩니다");
    }
}