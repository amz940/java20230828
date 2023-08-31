package ch08interface.lecture;

import java.io.Serializable;
import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;

public class C05typeConversion {
    public static void main(String[] args) {
        Integer i = 3;

        Serializable s = i;
        Comparable<Integer> ct = i;
        Constable c = i;
        ConstantDesc cd = i;
        Integer i2 = i;

        System.out.println(System.identityHashCode(i));
    }
}
