package 해시.위장;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {

  public int solution(String[][] clothes) {
    Map<String, Integer> map = new HashMap<>();
    int answer = 1;

    for (int i = 0; i < clothes.length; i++) {
      if ((map.get(clothes[i][1]) == null)) {
        map.put(clothes[i][1], 1);
      } else {
        map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
      }
    }



    for(Entry<String,Integer> m : map.entrySet()){
      answer *= m.getValue();
    }

    if(map.size() != 1){
      answer += clothes.length;
    }

    return answer;
  }
}