package ch11exception.lecture;

public class C02exception {
    public static void main(String[] args) {
        System.out.println("code 1...");
        System.out.println("code 2...");

        int[] arr = {1,2};
        int i = arr[2]; // ArrayIndexOutOfBoundsException
        // 배열 2인 인덱스에 3번째 자리에 오는 인덱스를 넣으려고 했다

        System.out.println("code 3...");
    }
}
