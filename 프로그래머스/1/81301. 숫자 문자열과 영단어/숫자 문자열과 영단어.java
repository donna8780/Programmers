class Solution {
    public int solution(String s) {
        int answer = 0;
        String li[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        //replace, String.valuOf, 최종 리턴 시 int로 바꿔줘야함
        //문자열동안
        for(int i = 0; i <li.length; i++){
            //문자열 하나가 리스트에 존재한다면,
            if(s.contains(li[i])){
                s= s.replace(li[i],Integer.toString(i)); 
            }
        }
       
        
        
        return Integer.parseInt(s);
    }
}