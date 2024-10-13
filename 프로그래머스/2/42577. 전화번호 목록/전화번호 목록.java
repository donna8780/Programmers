import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        //문자열 정렬, for문으로 비교, 뒤에 있는 문자열이 앞에있는 문자열에(접두어가 앞의 세자리)포함되는지, starswith();
        Arrays.sort(phone_book);
        for(int i = 1; i<phone_book.length; i++){
           if(phone_book[i].startsWith(phone_book[i-1])){
               answer = false;
               
           }
        }

        return answer;
    }
}