package ch16lambda.book.sec5.exam2;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        // (a,b) -> a.compareToIgnoreCase(b)
        //compareTo: 아나키 코드를 이용하여 두 문자열 사이의 숫자 크기 차이를 비교하는것
        //IngnoreCase : 문자열의 대소문자를 무시하고 진행
        person.ordering(String :: compareToIgnoreCase);
    }
}
