function solution(n) {

    const arr = [];
    for(let num = 1; num < n+1; num++){
        if(num % 2 === 1) {
            arr.push(Number(num));
        }
    }
    return arr;

}