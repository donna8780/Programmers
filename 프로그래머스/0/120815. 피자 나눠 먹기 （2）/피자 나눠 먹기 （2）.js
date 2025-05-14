function solution(n) {
    //10명이면 30조각 -> 3조각 씩 
    //4명이면 12조각 -> 3조각 씩
    let pizza = 1; //피자 판 수
    
    while((pizza * 6 ) % n !== 0){
        pizza+=1;
    }
    return pizza;
}