import java.util.*;

public class Solution {
    public String[] solution(String[] strings, int n) {
        // Arrays.sort를 사용하여 배열을 정렬
        Arrays.sort(strings, (s1, s2) -> {
            // n번째 문자를 비교
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            
            if (c1 == c2) {
                // n번째 문자가 같으면, 전체 문자열을 사전순으로 비교
                return s1.compareTo(s2);
            } else {
                // n번째 문자가 다르면, n번째 문자로 비교
                return Character.compare(c1, c2);
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] result = solution.solution(new String[]{"sun", "bed", "car"}, 1);
        System.out.println(Arrays.toString(result));  // 출력: [car, bed, sun]
    }
}
