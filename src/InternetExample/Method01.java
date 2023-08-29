package InternetExample;

public class Method01 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5,3);

    }
}

class MyMath{
    long add(long a, long b){
        long result = a +b;
        return result;
    }
}