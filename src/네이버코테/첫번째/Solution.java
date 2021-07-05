package 네이버코테.첫번째;


import java.util.Arrays;
import java.util.Collections;

public class Solution {
  public int solution(int[] prices, int[] discounts) {
    int answer = 0;
    Integer[] pricesArr = new Integer[prices.length]; // prices를 Integer형으로 받기위한 변수
    Integer[] discountsArr = new Integer[discounts.length]; // discounts Integer형으로 받기위한 변수

    pricesArr = Arrays.stream(prices).boxed().toArray(Integer[]::new); // stream을 사용하여 Integer로 형변환
    discountsArr = Arrays.stream(discounts).boxed().toArray(Integer[]::new); // stream을 사용하여 Integer로 형변환

    Arrays.sort(pricesArr, Collections.reverseOrder()); // 내림차순 정렬
    Arrays.sort(discountsArr, Collections.reverseOrder()); // 내림차순 정렬


    if(discountsArr.length >pricesArr.length){
      // 할인쿠폰의 개수가 더 많을경우

      for(int i=0; i<pricesArr.length; i++){
        answer += (pricesArr[i] * ((100-discountsArr[i]) / 100.0));
      }
    } else {
      // 할인쿠폰의 개수가 적을경우

      for(int i=0; i<discountsArr.length; i++){
        answer += (pricesArr[i] * ((100-discountsArr[i]) / 100.0));
      }

      // 나머지 가격들 합
      for(int i=discountsArr.length; i< pricesArr.length; i++){
        answer += pricesArr[i];
      }
    }

    if(answer != 0) answer+=1;

    return answer;
  }
}
