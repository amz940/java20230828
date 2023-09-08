package ch99reetCode.no1046;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

        // list
        // sort 정렬 , remove 지우기 , add 추가 , size 크기
        // [ 2,7,4,1,8,1 ]
        // 1. sort
        // [8,7,4,2,1,1]
        // 2. remove
        // [4,2,1,1]
        // 3. add
        // [4,2,1,1,1]

        // 1.sort
        //[4,2,1,1,1]
        // 2.remove
        //[1,1,1]
        // 3.add
        //[1,1,1,2]

        // 1.sort
        //[2,1,1,1]
        // 2.remove
        //[1,1]
        // 3.add
        //[1,1,1]  를  size 가 1이 될 때까지 실행
class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();

        for ( int stone : stones){
            list.add(stone);
        }

        while ( list.size() > 1 ){
            // 1. sort
//            list.sort(new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return 01 - 02;
//                }
//            });
            list.sort( (o1, o2) -> o2 - o1 );
            // 2. remove
            int stone1 = list.remove(0);
            int stone2 = list.remove(0);

            // 3. add
            int diff = stone1 -stone2;
            if (diff > 0){
                list.add(diff);
            }
        }

        if( list.size() == 1) {
            return list.get(0);
        }
        return 0;
    }
}
