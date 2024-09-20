class Solution {
    public int[] solution(int[] arr, int k) {
        
        for(int i = 0; i<arr.length; i++){
        //홀수
        if(k % 2 !=0){ 
            arr[i] = arr[i]*k;
        }
        //짝수
        else{
            arr[i]=arr[i]+k;
        }
    }
        return arr;
    }
}