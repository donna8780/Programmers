class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int d = 1;
        
        //1.합의 제곱
        for(int i =0; i<num_list.length; i++){
            sum+=num_list[i];
        }
        sum=sum * sum;
        
        //2.원소들의 곱
        for(int j = 0; j<num_list.length; j++){
            d*=num_list[j];
        }
        //3.원소들의 곱이 합의 제곱보다 작으면 1
        if(sum > d){
            answer = 1;
        }
        return answer;
    }
}