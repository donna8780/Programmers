import java.util.*;
class Solution {
    public int solution(int[] mats, String[][] park) {
    
        int answer = -1;
        Arrays.sort(mats);
       
        for(int i = mats.length-1; i>=0; i--){//매트 길이만큼  큰 것부터 검사.
            for(int j =0; j <= park.length - mats[i]; j++){//5행검사
                for(int k = 0; k<=park[0].length - mats[i]; k++ ){//park y도 뺸다.
                    boolean z = true;
                    bun: 
                    
                    for(int f= j; f < mats[i]+j;f++){
                        for(int h =k; h < mats[i] + k; h++){
                            if(!park[f][h].equals("-1")){
                                z = false;
                                break bun;
                            }
                            
                        }
                        
                    }
                
                   if(z == false){
                      
                   } 
                  else{
                      answer = mats[i];
                      return answer;
                  }
                    
                
                }
                
            }
            
        }
        
        return answer;
    }
}