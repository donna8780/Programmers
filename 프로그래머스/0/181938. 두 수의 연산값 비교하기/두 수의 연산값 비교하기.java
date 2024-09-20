class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String hh = Integer.toString(a)+Integer.toString(b);
        int hh2 = Integer.parseInt(hh);
        
        int hh3 = 2*a * b;
        
        return hh2 > hh3 ? hh2 : hh3;
    }
}