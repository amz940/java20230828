package ch98internetExample.toString;

import java.util.Objects;

public class Ex9_1 {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if( v1.equals(v2))
            System.out.println("v1과 v2는 같습니다");
        else
            System.out.println("v1과 v2는 다릅니다");

        System.out.println(v1.equals(v2));
    }
}

class Value{
    int value;

    Value(int value){
        this.value = value;
    }

    @Override
    public boolean equals(Object object) {
        // 주소 비교. 서로 다른 책체는 항상 거짓
        // 참조변수의 형변환 전에는 반드시 instanceof로 확인해야 함
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Value value1 = (Value) object;
        return value == value1.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
