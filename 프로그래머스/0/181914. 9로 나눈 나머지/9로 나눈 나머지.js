function solution(number) {
    var answer = 0;
    let sum = 0;
    for(num of number){
        sum += +num;
    }
    answer=sum%9
    return answer;
}