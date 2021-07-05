package 해시.완주하지못한선수;

public class Main {
  public static void main(String[] args) {
    boolean allPass = true;
    Solution A = new Solution();

    if(!A.solution(new String[]{"leo", "kiki", "eden"},new String[]{"eden", "kiki"}).equals("leo")){
      System.out.println("완주하지_못한_선수 1번 실패");
      allPass = false;
    }

    if(!A.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"},new String[]{"josipa", "filipa", "marina", "nikola"}).equals("vinko")){
      System.out.println("완주하지_못한_선수 2번 실패");
      allPass = false;
    }

    if(!A.solution(new String[]{"mislav", "stanko", "mislav", "ana"},new String[]{"stanko", "ana", "mislav"}).equals("mislav")){
      System.out.println("완주하지_못한_선수 3번 실패");
      allPass = false;
    }

    if (allPass) System.out.println("완주하지_못한_선수 전체 성공");
  }
}
