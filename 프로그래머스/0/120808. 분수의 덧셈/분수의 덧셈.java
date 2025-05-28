class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        //분모 = denom, 분자 = numer
        int denom = denom1 * denom2;
        int numer = denom1 * numer2 + denom2 * numer1;
        
        //최대공약수 구하기
        int gcd = GCD(numer, denom);
        
        //분모, 분자에 최대공약수로 나누기, 새로운 배열 생성해서 바로 리턴
        return new int[]{numer/gcd, denom/gcd};
    }
    
    private static int GCD(int a, int b){
        while (b!=0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
/*
알고리즘 설명
a, b 중에서 a가 더 큰 수라고 가정

a % b를 계산해서 나머지를 구함 → 이걸 tmp에 저장

a ← b, b ← tmp로 갱신

b가 0이 될 때까지 반복

반복 종료 시 a가 최대공약수
*/