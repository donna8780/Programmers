class Solution {
    public int[] solution(int n, int m) {
        int k = 0; // 최대공약수 k

        // 최대공약수 구하기
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {  // 두 수가 모두 i로 나누어 떨어지면
                k = i; // 그 값을 최대공약수로 설정
            }
        }
        
        // 최소공배수는 두 수의 곱을 최대공약수로 나눈 값
        int lcm = n * m / k;
        
        // 결과 배열에 최대공약수와 최소공배수 저장
        int[] answer = {k, lcm};
        
        return answer;
    }
}
