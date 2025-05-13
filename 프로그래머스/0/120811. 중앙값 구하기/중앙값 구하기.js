function solution(array) {
    
    array.sort((a,b) => a-b);//오름차순 정렬
    const mid = Math.floor(array.length/2);//중간 인덱스 구하기(인덱스는 0부터 시작이니까!)
    
    return array[mid];
}