function solution(age) {
    //1. age 는 숫자로 들어옴.
    //이걸 문자로 바꿔주는 로직 필요함
    
    const obj = {0:'a', 1:'b', 2:'c', 3:'d', 4:'e', 5:'f', 6:'g', 7:'h', 8:'i', 9:'j'};
    
    let answer = ''; // 문자열로 반환되어야 함.
    age = age.toString();
    
    for(let key of age){
        answer += obj[key];
    }
    return answer;
}
//in은 존재유무를 확인할 때, of는 값을 꺼낼 때 사용한다.