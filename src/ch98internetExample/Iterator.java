package ch98internetExample;

import java.util.ArrayList;

public class Iterator {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");

        java.util.Iterator it = list.iterator();

        while( it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        it = list.iterator(); // 이미 다 읽은 코드라 다시 불러여함
        while( it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
