package ch06class;

public class C10capsule {

}

class MyClass10 {
    // 특별한 사유가 없으면 field 앞에 private를 붙여줘야 한다
    // field가 자기 혼자 동작하면 안되기 때문에
    // 관련된 method(주로 getter, setter) 앞에는 public을 붙여준다
    // 읽기 전용으로 하고 싶다(받을 땐) getter
    // 쓰기 전용으로 하고 싶다(보낼 땐) setter
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}