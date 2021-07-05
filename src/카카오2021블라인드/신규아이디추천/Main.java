package 카카오2021블라인드.신규아이디추천;


public class Main {
  public static void main(String[] args) {
    boolean allPass = true;
    Solution A = new Solution();

    if(!A.solution("...!@BaT#*..y.abcdefghijklm").equals("bat.y.abcdefghi")){
      System.out.println("신규 아이디 추천 1번 실패");
      allPass = false;
    }

    if(!A.solution("z-+.^.").equals("z--")){
      System.out.println("신규 아이디 추천 2번 실패");
      allPass = false;
    }

    if(!A.solution("=.=").equals("aaa")){
      System.out.println("신규 아이디 추천 3번 실패");
      allPass = false;
    }

    if(!A.solution("123_.def").equals("123_.def")){
      System.out.println("신규 아이디 추천 4번 실패");
      allPass = false;
    }

    if(!A.solution("abcdefghijklmn.p").equals("abcdefghijklmn")){
      System.out.println("신규 아이디 추천 5번 실패");
      allPass = false;
    }



    if (allPass) System.out.println("신규 아이디 추천 통과");
  }
}
