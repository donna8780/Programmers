class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for(int i = 0; i < answer.length; i++){

            int idx = 1;
            for(int j = 0; j < answer.length; j++){
                if(emergency[i] < emergency[j]){  // 자신보다 큰 응급도가 몇 개인지 카운트
                    idx++;
                }
            }
            answer[i] = idx;  // 순위 저장
        }
        return answer;
    }
}
