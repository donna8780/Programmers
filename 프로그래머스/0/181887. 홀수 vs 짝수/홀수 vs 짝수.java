class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int hol = 0;
        int zzack = 0;
        for(int i= 0; i<num_list.length; i+=2){
            hol+=num_list[i];
        }
        for(int i = 1; i<num_list.length; i+=2){
            zzack+=num_list[i];
        }
        answer =  (hol > zzack) ?hol:zzack;
        return answer;
        
    }
}