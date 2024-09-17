class Solution {
    public int[] solution(int n, int[] numlist) {
        int count = 0;
        
        // 첫 번째 반복문 수정
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int answer_idx = 0;
        
        // 두 번째 반복문 수정
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                answer[answer_idx] = numlist[i];
                answer_idx++;
            }
        }
        
        return answer;
    }
}
