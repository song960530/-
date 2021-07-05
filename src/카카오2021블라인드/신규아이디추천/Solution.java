package 카카오2021블라인드.신규아이디추천;

public class Solution {

  public String solution(String new_id) {
    return recommendId(new_id);
  }

  public String recommendId(String new_id) {
    String answer = "";

    answer = step1(new_id);
    answer = step2(answer);
    answer = step3(answer);
    answer = step4(answer);
    answer = step5(answer);
    answer = step6(answer);
    answer = step7(answer);

    return answer;
  }


  // 소문자 치환
  public String step1(String id) {
    return id.toLowerCase();
  }

  // 소문자, 숫자, 빼기, 밑줄, 마침표 외에 다른문자 제거
  public String step2(String id) {
    return id.replaceAll("[^a-z0-9\\-\\_\\.]", "");
  }

  // 마침표가 2개이상 붙어있으면 하나로 치환
  public String step3(String id) {
    return id.replaceAll("[.]{2,}", ".");
  }

  // 시작과 끝에 마침표가 있으면 제거
  public String step4(String id) {
    if (id.startsWith(".")) {
      id = id.substring(1);
    }
    if (id.endsWith(".")) {
      id = id.substring(0, id.length() - 1);
    }

    return id;
  }

  // 빈문자열일경우 a 삽입
  public String step5(String id) {
    if ("".equals(id)) {
      id = "a";
    }

    return id;
  }

  // 길이가 16이상일경우 15까지 자름, 마침표로 끝나는경우 제거
  public String step6(String id) {
    if (id.length() > 15) {
      id = id.substring(0, 15);
    }
    if (id.endsWith(".")) {
      id = id.substring(0, id.length() - 1);
    }

    return id;
  }

  // 길이가 2 이하면 가장 마지막 문자를 붙여서 3이상이 되도록 함
  public String step7(String id) {
    if (id.length() < 3) {
      char lastChar = id.charAt(id.length() - 1);
      id = (id.length() == 1 ? id + lastChar + lastChar : id + lastChar);
    }

    return id;
  }
}