package ch16lambda.example.no7;

public class Example {
    private static int[] scores = { 10, 50 , 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];

        for (int score : scores){
            result = operator.apply(result, score);
//            result = (result < score) ? score : result ; 삼항연산자로도 가능
        }
        return  result;
    }

    public static void main(String[] args) {
        // 최댓값 구하는 식
        int max = maxOrMin( ( x, y ) -> ( x < y) ? y: x );

//        int max = maxOrMin(( x,y ) -> {
//            if (x > y){
//                return x;
//            } else {
//                return y;
//            }
//        });
//
//        int max = maxOrMin( ( x, y) -> Math.max(x,y));

//        int max = maxOrMin(Math::max);
//        System.out.println("max = " + max);

        // 최솟값 구하는 식
        int min = maxOrMin((x,y)-> Math.min(x,y));
//        int min = maxOrMin(Math::min);

        System.out.println("min = " + min);
    }
}
