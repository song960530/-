package 네이버코테.세번째;


public class Main {
  public static void main(String[] args) {
    boolean allPass = true;
    Solution A = new Solution();

    if(A.solution("aabcbcd","abc") != 2){
      System.out.println("1번 실패");
      allPass = false;
    }

    if(A.solution("aaaaabbbbb","ab") != 5){
      System.out.println("2번 실패");
      allPass = false;
    }

    if (allPass) System.out.println("네이버웹툰 세번째 문제 통과");
  }
}
