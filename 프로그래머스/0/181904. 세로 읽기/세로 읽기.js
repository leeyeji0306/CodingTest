function solution(my_string, m, c) {
    var answer = '';
    for(let i = 0; m*(i+1)<=my_string.length; i++){
        let str = my_string.slice(m*i, m*(i+1));
        answer+=str.charAt(c-1);
    }
    return answer;
}