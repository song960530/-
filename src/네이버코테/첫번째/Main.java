package 네이버코테.첫번째;


public class Main {
  public static void main(String[] args) {
    boolean allPass = true;
    Solution A = new Solution();

    if(A.solution(new int[]{13000,88000,10000},new int[]{30,20}) != 82000){
      System.out.println("1번 실패");
      allPass = false;
    }

    if(A.solution(new int[]{32000,18000,42500},new int[]{50,20,65}) != 45275){
      System.out.println("2번 실패");
      allPass = false;
    }

    if (allPass) System.out.println("네이버웹툰 첫번째 문제 통과");
  }
}
