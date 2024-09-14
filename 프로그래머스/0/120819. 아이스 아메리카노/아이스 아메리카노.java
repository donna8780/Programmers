class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int gaesu = money / 5500;
        int namuge = money % 5500;
        answer[0] = gaesu;
        answer[1] = namuge;
        return answer;
    }
}