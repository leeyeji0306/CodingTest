function solution(age) {
    var answer = '';
    let strAge = age.toString()
    for(let num of strAge){
        answer+=String.fromCharCode(+num+97)
    }
    return answer;
}