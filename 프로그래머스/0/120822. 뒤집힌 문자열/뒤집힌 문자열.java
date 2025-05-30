class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder(my_string);
        return sb.reverse().toString(); //StringBuilder는 String이 아니다. 
    }
}