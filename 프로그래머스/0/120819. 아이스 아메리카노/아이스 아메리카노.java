class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int result = money / 5500; // 잔의 개수
        int remain = money - (5500*result); // 남은 돈
        for (int i = 0; i<1; i++){
            answer[i] = result;
        }
        for(int i = 1; i< 2; i++){
            answer[i] = remain;
        }
        return answer;
    }
}