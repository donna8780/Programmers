class Solution {
    public int solution(int n) {
        // n과 6의 최소공배수를 구하고, 그걸 6으로 나눠 피자 판 수 구하기
        int num = gcd(6,n);
        int answer = num * (n/num) * (6/num);
            return answer/6;
    }

    // 최대공약수(GCD) 함수
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a; //이게 최대공약수가 된다.
    }

}
