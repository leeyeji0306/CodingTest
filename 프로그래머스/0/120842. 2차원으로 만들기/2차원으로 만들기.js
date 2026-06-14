function solution(num_list, n) {
    var answer = [[]];
    let i = 0;
    let j = 0;
    for(num of num_list){
        answer[j].push(num)
        i++
        if(i===n){
            i=0
            if(j+1 !== num_list.length/n)answer.push([])
            j++
        }
    }
    return answer;
}