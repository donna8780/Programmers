class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        // a가 b보다 크면 둘을 교환
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // a부터 b까지의 합을 구함
        for (int i = a; i <= b; i++) {
            answer += i;
        }

        return answer;
    }
}
