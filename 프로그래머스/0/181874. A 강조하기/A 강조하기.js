function solution(myString) {
    var answer = '';
    for(ch of myString){
        if(ch==='a'){
            answer+="A";
            continue
        } else if(ch>'A' && ch<='Z'){
            answer+=ch.toLowerCase();
            continue
        }
        answer+=ch;
    }
    return answer;
}