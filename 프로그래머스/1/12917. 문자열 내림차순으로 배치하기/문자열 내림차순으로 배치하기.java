import java.util.*;

class Solution {
    public String solution(String s) {
        
        String answer = "";
        //toCharArray로 받아온 문자열을 문자로 잘라서 arr에 넣어준다.
        char arr[] = s.toCharArray();
        //arr를 sorting한다.
        Arrays.sort(arr);
        //arr를 출력해본다.
        System.out.println(Arrays.toString(arr));
        //내림차순으로 바꾼다.
        for(int i = arr.length-1; i >=0 ; i--){
            answer+=arr[i];
        }
        
        
        return answer;
    }
}