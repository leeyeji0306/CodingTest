function solution(my_string) {
    var answer = '';
    let temp = new Set()
    for(str of my_string){
        temp.add(str)
    }
    for (str of temp){
        answer+=str
    }
    return answer;
}