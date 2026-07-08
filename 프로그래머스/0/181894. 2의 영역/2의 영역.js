function solution(arr) {
        let max = 0;
        let min = 100001;
        for(let i = 0; i<arr.length; i++){
            if(arr[i] == 2){
                if(max < i){
                    max = i;
                }
                if(min > i){
                    min = i;
                }
            }
        }
        if(max == 0 && min == 100001){
            return [-1]
        }
        return arr.slice(min, max+1);
    }