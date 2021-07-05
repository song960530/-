package 네이버코테.세번째;


import java.util.Arrays;
import java.util.Collections;

public class Solution {
  public int solution(String s, String t) {
    int answer = 0;

    while(s.contains(t)){
      s = s.replace(t,"");
      answer += 1;
    }

    return answer;
  }
}
