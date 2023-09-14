package ch11exception.book.sec3.exam2;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = { "100", "1oo"};

        for(int i = 0; i<=array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 초과 : " + e.getMessage());
            } catch (Exception e){
                System.out.println("실행 문제");
            }
        }
    }
}
