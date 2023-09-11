package ch98internetExample.equals;

import java.util.Objects;

public class Person {
    public static void main(String[] args) {
        Equal eq = new Equal(88000);
        Equal eq2 = new Equal(88000);
        System.out.println(eq.equals(eq2));

    }
}

class Equal{
    long id;

    Equal(long id){
        this.id = id;
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Equal equal = (Equal) object;
        return id == equal.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
