function solution(myString, pat) {
    var answer = 0;
    let petLength = pat.length
    while(myString.indexOf(pat) !== -1){
        answer++;
        let index = myString.indexOf(pat)
        myString = myString.slice(index+1)
    }
    return answer;
}