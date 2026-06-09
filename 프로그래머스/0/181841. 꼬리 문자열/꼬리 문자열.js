function solution(str_list, ex) {
    var answer = '';
    for(str of str_list){
        if(str.indexOf(ex)===-1){
            answer+=str
        }
    }
    return answer;
}