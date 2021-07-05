package 해시.전화번호목록;

public class Main {
  public static void main(String[] args) {
    boolean allPass = true;
    Solution A = new Solution();

    if(A.solution(new String[]{"119", "97674223", "1195524421"})){
      System.out.println("전화번호목록 1번 실패");
      allPass = false;
    }

    if(!A.solution(new String[]{"123", "456", "789"})){
      System.out.println("전화번호목록 2번 실패");
      allPass = false;
    }

    if(A.solution(new String[]{"12", "123", "1235", "567", "88"})){
      System.out.println("전화번호목록 3번 실패");
      allPass = false;
    }

    if (allPass) System.out.println("전화번호목록 전체 성공");
  }
}
