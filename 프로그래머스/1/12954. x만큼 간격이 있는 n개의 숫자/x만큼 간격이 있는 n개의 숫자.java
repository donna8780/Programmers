class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; // 배열은 고정이라서 크기 지정해줘야 함.

        // 고정 길이만큼 for문을 돌면서, 인덱스 지정
        // for(int i = 0; i <= n-1; i++){
        //     answer[i] = x * (long)i;
        // 0이 곱해지기 때문에 답이 될 수 없음

        for(int i = 1; i <= n; i++){
            answer[i-1] = x * (long)i;
        }

        return answer; // for 루프가 끝난 후, answer 배열을 반환
    }
}
