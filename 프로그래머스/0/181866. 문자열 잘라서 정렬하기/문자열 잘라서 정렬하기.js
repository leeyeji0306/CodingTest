function solution(myString) {
    let answer = myString.split("x");
    let temp = 0;
    answer.sort()
    while(answer.includes("")){
        answer.shift();
    }
    return answer;
}