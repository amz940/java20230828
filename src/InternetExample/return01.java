package InternetExample;

public class return01 {
    public static void main(String[] args) {
        Gugudan gugu = new Gugudan();
        gugu.gugudan(2);
    }


}

class Gugudan{
    void gugudan( int dan){
        if( !(2<=dan && dan<= 9))
            return;
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d\n",dan, i ,dan*i);
        }
    }
}