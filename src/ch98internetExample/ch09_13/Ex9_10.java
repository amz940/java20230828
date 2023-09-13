package ch98internetExample.ch09_13;

public class Ex9_10 {
    public static void main(String[] args) {
        int i = 100;
        String str = String.valueOf(i);
        String str2 = i +"";
        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        System.out.println(str == str2);
        System.out.println();

        int i3 = 50;
        String str3 = "50";
        int i2 = Integer.valueOf(str3);
        System.out.println(i2 == i3);
    }
}
