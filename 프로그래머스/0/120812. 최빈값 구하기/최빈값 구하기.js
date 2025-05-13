function solution(array) {

    const count = {};//숫자별 갯수를 세는 거니까 키값 형태로 저장하려고 등장횟수 객체 
    
    for(let num of array){
        count[num] = (count[num] !== undefined ? count[num] : 0) + 1;  
        //count[num] 이 undefined라면, count[num]을 등록하고, 등장횟수 1을 쓴다.
        //count[num]이 이미 있다면, +1을 해서 총 2가 된다.
    }
    
    //2. 가장 많이 나온 횟수 찾기
    let maxCount=0;
    for(let key in count){
        if(count[key] > maxCount){
            maxCount = count[key];
        }
    }
    
    //3.maxCount에 해당하는 숫자들을 배열로 모으기
    const mostFrequent=[];
    for(let key in count){
        if(count[key] === maxCount){
            mostFrequent.push(Number(key));
        }//key는 문자열이므로 숫자로 변환
    }
    
    //4.최빈값이 여러개면 -1, 하나면 그 값을 리턴
    if(mostFrequent.length >1) {
        return -1
    }else{
        return mostFrequent[0];
    }
}