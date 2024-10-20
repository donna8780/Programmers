import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        //a,b오름차순 정렬해서 두개의값배교
        //b가 크면 answer을 올려줌
        //for문 하나만 쓰면 디 길이는 b의 길이 끝만큼
        //b를 보고 하니까
        Arrays.sort(A);
        Arrays.sort(B);
        int a = 0;
        for(int i = 0; i<B.length; i++){
            
            if(B[i] > A[a]){
                answer +=1;
                a++;
               
            }
        }
        
        
        return answer;
    }
}