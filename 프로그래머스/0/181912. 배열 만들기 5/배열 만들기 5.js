function solution(intStrs, k, s, l) {
    var answer = [];
    for(i of intStrs){
        let num = +(i.slice(s, s+l));
        if(num > k){
            answer.push(num);
        }
    }
    return answer;
}