function solution(myString, pat) {
    var answer = '';
    let index = myString.lastIndexOf(pat);
    answer=myString.slice(0, index+pat.length)
    return answer;
}