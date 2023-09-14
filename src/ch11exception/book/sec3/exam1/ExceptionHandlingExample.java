package ch11exception.book.sec3.exam1;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] str = {"100", "1oo"};

        for (int i = 0; i<= str.length; i++){
            try{
                int value = Integer.parseInt(str[i]);
                System.out.println("str["+i+"] = " + value);
            } catch(ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
                System.out.println("인덱스 오류");
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("변환 오류");
            }
        }
    }
}
