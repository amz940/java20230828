package ch11exception.exam.no6;

public class exam6 {
    public static void main(String[] args) {
        String[] str = { "10", "2a", "4"};
        int value = 0;
        for (int i = 0; i<=2; i++){
            try{
                value = Integer.parseInt(str[i]);
//                System.out.println(value);
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스를 초과");
            } catch (NumberFormatException e){
                System.out.println("숫자로 변환 안됨");
            } finally {
                System.out.println(value);
            }
        }
    }
}
