package 해시.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public String solution(String[] participant, String[] completion) {
    String response = "";
    Map<String, Integer> map = new HashMap<>();

    for (String a : participant) {
      if (map.get(a) == null) {
        map.put(a, 1);
      } else {
        map.put(a, map.get(a) + 1);
      }
    }
    for (String b : completion) {
      map.put(b, map.get(b) - 1);
    }

    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      if (entry.getValue() != 0) {
        response = entry.getKey();
        break;
      }
    }

    return response;
  }
}
