package ch98internetExample.boxing;

public class ParseInt {
    public static void main(String[] args) {
        int i = Integer.parseInt("100");
        System.out.println("i = " + Integer.parseInt("100",10));
        System.out.println("i = " + Integer.parseInt("100",2));
        System.out.println("i = " + Integer.parseInt("100",4));
        System.out.println("i = " + Integer.parseInt("100",8));
    }
}
