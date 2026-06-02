function solution(myString, pat) {
    let lowerMyString = myString.toLowerCase()
    let lowerPat = pat.toLowerCase()
    if(lowerMyString.indexOf(lowerPat)!==-1){
        return 1;
    }
    return 0;
}