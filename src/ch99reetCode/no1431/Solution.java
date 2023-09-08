package ch99reetCode.no1431;

import java.util.ArrayList;
import java.util.List;


// 복사해서 인텔리 j로 실현하는 방법
// 9월 8일자 영상 1시간 30분 부터 시작하니 꼭 확인해서 따라해볼껏
// junit code test 검색해서 참고 해볼껏
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // for문 돌리고
        // 배열에 엑스트라 더해서 == 최댓값
        List<Boolean> list = new ArrayList<>();
        // 배열에서 최대값 구하기
        int max = 0;
        for (int candy : candies){
            max = Math.max(max, candy);
        }

        // extra 와 더해서 max보다 크거나 같은지를 arraylist에 추가
        // [2,3,5,1,3]
        // list.add((2 + 3)) >= 5 ); // true
        // list.add((3 + 3)) >= 5 ); // true
        // list.add((5 + 3)) >= 5 ); // true
        // list.add((1 + 3)) >= 5 ); // false
        // list.add((3 + 3)) >= 5 ); // true

        for ( int candy : candies){
            list.add( (candy + extraCandies) >= max);
        }

        return list;

    }
}

