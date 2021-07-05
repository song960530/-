package 카카오2021블라인드.메뉴리뉴얼;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class Solution {

  public String[] solution(String[] orders, int[] course) {
    Combination combination = new Combination();
    List<String> combindList = new ArrayList<>();

    Arrays.sort(orders);
    Arrays.sort(course);

    for (int c : course) {
      for (String order : orders) {
        if (order.length() < c) {
          continue;
        } else {
          combination.firstJob(order);
          combination.doCombination(order.length(), c, 0);
        }
      }

      int maxcount = 0;
      for (Entry<String, Integer> entry : combination.combindMap.entrySet()) {
        if (entry.getValue() > 1 && entry.getValue() > maxcount) {
          maxcount = entry.getValue();
        }
      }

      for (Entry<String, Integer> entry : combination.combindMap.entrySet()) {
        if (maxcount == entry.getValue()) {
          combindList.add(entry.getKey());
        }
      }

      combination = new Combination();
    }

    String[] result = combindList.stream().toArray(String[]::new);
    Arrays.sort(result);
    return result;
  }


  class Combination {

    private Map<String, Integer> combindMap;
    private Stack<String> st;
    private String[] arr;

    public Combination() {
      combindMap = new HashMap<>();
    }

    public void firstJob(String s) {
      this.arr = new String[s.length()];
      for (int i = 0; i < s.length(); i++) {
        arr[i] = s.charAt(i) + "";
      }
      this.st = new Stack<>();
    }

    public void inputCombind() {
      String combindStr = "";

      for (int i = 0; i < st.size(); i++) {
        combindStr += st.get(i);
      }

      String[] combindarr = new String[combindStr.length()];

      for (int i = 0; i < combindarr.length; i++) {
        combindarr[i] = combindStr.charAt(i) + "";
      }
      Arrays.sort(combindarr);
      combindStr = "";

      for (int i = 0; i < combindarr.length; i++) {
        combindStr += combindarr[i];
      }

      combindMap.put(combindStr, combindMap.getOrDefault(combindStr, 0) + 1);
    }

    public void doCombination(int n, int r, int index) {
      if (r == 0) {
        inputCombind();
        return;
      } else if (n == r) {
        for (int i = 0; i < n; i++) {
          st.add(arr[index + i]);
        }
        inputCombind();
        for (int i = 0; i < n; i++) {
          st.pop();
        }
      } else {
        st.add(arr[index]);
        doCombination(n - 1, r - 1, index + 1);

        st.pop();
        doCombination(n - 1, r, index + 1);
      }
    }
  }
}