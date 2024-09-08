import java.util.*;

class Solution {
    public String solution(String new_id) {

        String answer = "";

        // 1. 소문자로 변환
        answer = new_id.toLowerCase();

        // 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자 제거
        answer = answer.replaceAll("[^a-z0-9-_.]", "");

        // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표로 변경
        answer = answer.replaceAll("\\.{2,}", ".");

        // 4. 마침표(.)가 처음이나 끝에 위치한다면 제거
        answer = answer.replaceAll("^[.]|[.]$", "");

        // 5. 빈 문자열이라면 "a"를 대입
        if (answer.equals("")) {
            answer = "a";
        }

        // 6. 길이가 16자 이상이면, 첫 15자를 제외한 나머지 문자 제거
        // 만약 제거 후 마지막 문자가 마침표(.)라면 마지막 마침표도 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            if (answer.charAt(answer.length() - 1) == '.') {
                answer = answer.replaceAll("[.]$", "");
            }
        }

        // 7. 길이가 2자 이하라면, 마지막 문자를 길이가 3이 될 때까지 반복해서 끝에 붙임
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                char c = answer.charAt(answer.length() - 1);
                answer += c;
            }
        }

        return answer;
    }
}
