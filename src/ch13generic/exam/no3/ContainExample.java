package ch13generic.exam.no3;

public class ContainExample {
    public static void main(String[] args) {
        Container<String, String> container1 = new Container<>();
        container1.set("홍길동","도적");
        String name1 = container1.getKey();
        String job = container1.getValue();
        System.out.println(name1 +"은 "+job + " 입니다");

        Container<String, Integer> container2 = new Container<>();
        container2.set("홍길동", 35);
        String name2 = container2.getKey();
        int age = container2.getValue();
        System.out.println(name2 +"은 "+age + " 살입니다");
    }
}

class Container<K,V>{
    private K key;
    private V value;

    public void set(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }



}
