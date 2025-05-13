function solution(numer1, denom1, numer2, denom2) {
    
    const numer = (numer2 * denom1) + (numer1 * denom2);
    const denom = denom1 * denom2;
    
    //최대공약수를 구하는 함수
    //a와 b의 최대공약수는 b와 a를 b로 나눈 나머지의 최대공약수와 같다.
    function gcd(a, b) {
        return b === 0 ? a : gcd(b, a%b)
    }
    //구해진 최대공약수
    const common = gcd(numer, denom);
    
    return [numer / common, denom / common];
}