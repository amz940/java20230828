package ch13generic.lecture;

public class C04generic {
    public static void main(String[] args) {
        MyClass04<String> o1 = new MyClass04<>();
        o1.setField("java");
        String a = o1.getField();
        System.out.println(a);

        MyClass04<Integer> o2 = new MyClass04<>();
        o2.setField(500);
        Integer a2 = o2.getField();
        int a22 = o2.getField();

        MyClass04<Long> o3 = new MyClass04<>();
        o3.setField(50000000L);
        Long a3 = o3.getField();
        long a33 = o3.getField();
        System.out.println(a3);
    }
}

class MyClass04<T>{
    private T field;

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }
}
