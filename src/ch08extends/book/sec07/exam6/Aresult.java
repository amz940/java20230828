package ch08extends.book.sec07.exam6;



public class Aresult {
    static void action(Aexam a){
        a.method1();
        if( a instanceof C c ){
            c.method2();
        }
        //구버전이라 기능이 지원 안될경우
//        if( a instanceof C){
//            C c = (C) a;
//            c.method2();
//        }
    }

    public static void main(String[] args) {
        action(new Aexam());
        action(new B());
        action(new C());
    }
    
    
}
