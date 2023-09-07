package ch13generic.exam.no2;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1 = new Container();
        container1.setContainer("홍길동");
        String a = container1.getContainer();
        System.out.println(a);

        Container<Integer> container2 = new Container<>();
        container2.setContainer(500);
        int b = container2.getContainer();
        System.out.println(b);
    }
}

class Container<T>{
    private T container;

    public void setContainer(T container) {
        this.container = container;
    }

    public T getContainer() {
        return container;
    }
}