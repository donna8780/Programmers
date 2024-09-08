import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        // 두 숫자의 합을 set에 추가 (중복 자동 제거)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        // Set을 List로 변환한 후 정렬
        List<Integer> answerList = set.stream().collect(Collectors.toList());
        Collections.sort(answerList);

        // List를 배열로 변환하여 반환
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
