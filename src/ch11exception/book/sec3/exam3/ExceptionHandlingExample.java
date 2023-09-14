package ch11exception.book.sec3.exam3;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100","1oo","200",null};

        for (int i = 0; i <= array.length; i++){
            try{
                int value = Integer.parseInt(array[i]);
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 오류 : " + e.getMessage());
            } catch (NumberFormatException | NullPointerException e){
                System.out.println("데이터 오류 :" + e.getMessage());
            }
        }
    }
}
