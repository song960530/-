package 해시.위장;

public class Main {
  public static void main(String[] args) {
    boolean allPass = true;
    Solution A = new Solution();

    if(A.solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}) != 5){
      System.out.println("위장 1번 실패");
      allPass = false;
    }

    if(A.solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}) != 3){
      System.out.println("위장 2번 실패");
      allPass = false;
    }

    if(A.solution(new String[][]{{"a","aa"},{"b","aa"},{"c","aa"},{"aa","bb"},{"bb","bb"},{"c_c","bb"},{"aaa","cc"},{"bbb","cc"},{"ccc","cc"}}) != 63){
      System.out.println("위장 3번 실패");
      allPass = false;
    }

    if(A.solution(new String[][]{{"a", "a"},{"b", "b"},{"c", "c"}}) != 7){
      System.out.println("위장 4번 실패");
      allPass = false;
    }

    if (allPass) System.out.println("위장 전체 성공");

  }
}
