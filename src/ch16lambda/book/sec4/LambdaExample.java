package ch16lambda.book.sec4;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        //실행문이 2개 이상 일 경우
        person.action( (x,y) -> {
            double result = x+y;
            return result;
        });

        //return 문이 하나만 있을 경우(연산식)
        /* person.action( (x,y) -> {
            return ( x+y );
            });
         */
        person.action((x,y) -> (x + y));

        //return 문이 하나만 있을 경우(메소드 호출)
        /* person.action ( ( x,y) -> {
            return sum( x,y );
            });
         */
        person.action((x,y) -> sum(x,y));

    }
        public static double sum(double x, double y){
            return (x+y);
        }
}
