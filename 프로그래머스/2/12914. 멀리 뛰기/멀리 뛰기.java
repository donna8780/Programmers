class Solution {
    public long solution(int n) {
        long answer = 0;
        long f[] = new long[n+2];
        f[1] = 1;
        f[2] = 2;

        for(int i = 3; i<=n; i++){
            f[i]=  (f[i-1]+f[i-2]) % 1234567 ;
        }
        return f[n];
    }
}