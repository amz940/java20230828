package ch12api.lecture;

import java.util.Arrays;

public class C24arrays {
    public static void main(String[] args) {
        // Arrays 배열을 다루는 메소드들이 있다
        // equals : 두 배열이 같은지
        // fill : 배열을 특정 값으로 채우기
        // sort : 배열을 정렬하기
        // binarySearch : 특정 원소의 위치 찾기
        // toString : 문자열로 변환

        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        for ( int i = 0 ; i < arr1.length; i++){
            arr1[i] = 10;
        }
        System.out.println(Arrays.toString(arr1));
            // fill 사용법 : for문을 없애준다
        Arrays.fill(arr1, 5);
        System.out.println(Arrays.toString(arr1));

            // sort
        int[] arr2 = { 3, 123,20,4,6};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

            // equals
        int[] arr3 = {3,4,5};
        int[] arr4 = {3,4,5};
        int[] arr5 = {4,3,5};

        System.out.println(arr3 == arr4); // false
        System.out.println(Arrays.equals(arr3,arr4)); // true
        System.out.println(Arrays.equals(arr3,arr5)); // false

        Arrays.sort(arr4);
        Arrays.sort(arr5);
        System.out.println(Arrays.equals(arr4,arr5)); // true

            // binarySearch : 이진 탐색
            // 사용할려면 꼭 sort 를 활용해 정렬 해야 한다
        int[] arr6 = {5,6,3,1,8,9};
        int i = Arrays.binarySearch(arr6, 3);
        System.out.println(i);
        Arrays.sort(arr6);
        int y = Arrays.binarySearch(arr6, 3);
        System.out.println(y);
    }
}
