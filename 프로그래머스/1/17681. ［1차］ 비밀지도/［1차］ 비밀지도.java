

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];//크기가 고정되어있으니까 크기가 n인 배열로 초기화
        //Integer.toString("9",2);//2진수로 바꾸는 함수
        //String.format("%02d");//자릿수가 부족하면 0으로 채운다.
        //String.format("%08s");
        
        
      for(int i = 0; i<n; i++){
          //int a1 = (Integer.parseInt(Integer.toString(arr1[i], 2)));
          
          //int a2 = Integer.parseInt(Integer.toString(arr1[i], 2));
          answer[i]=Integer.toString(arr1[i] | arr2[i],2);
          answer[i]=String.format("%"+n+"s",answer[i]);
          answer[i]= answer[i].replace("0"," ");
          answer[i] = answer[i].replace("1", "#");
          System.out.println(Integer.toString(arr1[i] | arr2[i],2));
      }  
        
        
        
        return answer;
    }
}