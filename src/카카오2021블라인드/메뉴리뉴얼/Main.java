package 카카오2021블라인드.메뉴리뉴얼;


public class Main {

  public static void main(String[] args) {
    boolean allPass = true;
    Solution A = new Solution();

    String[] result = new String[]{"AC", "ACDE", "BCFG", "CDE"};
    int i = 0;
    for (String r : A.solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4})) {
      if (!r.equals(result[i])) {
        System.out.println("메뉴 리뉴얼 1번 실패");
        allPass = false;
      }
      i++;
    }

    result = new String[]{"ACD", "AD", "ADE", "CD", "XYZ"};
    i = 0;
    for (String r : A.solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"}, new int[]{2, 3, 5})) {
      if (!r.equals(result[i])) {
        System.out.println("메뉴 리뉴얼 2번 실패");
        allPass = false;
      }
      i++;
    }

    result = new String[]{"WX", "XY"};
    i = 0;
    for (String r : A.solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4})) {
      if (!r.equals(result[i])) {
        System.out.println("메뉴 리뉴얼 3번 실패");
        allPass = false;
      }
      i++;
    }

    if (allPass) {
      System.out.println("메뉴 리뉴얼 성공");
    }
  }
}
