import java.util.*;

class Solution {
    public int[] solution(int n) {
        Set<Integer> set = new HashSet<>();
        while(true){
            for(int i=2; i <= n; i++){
                if(n % i == 0){
                    set.add(i);
                    n/=i;
                    break;
                }
            } 
            if(n == 1){
                break;
            }
        }
        
        Integer[] temp = set.toArray(new Integer[0]);
        int[] answer = new int[temp.length];
        Arrays.sort(temp);
        for(int i=0; i<answer.length; i++){
            answer[i] = temp[i];
        }
        
        return answer;
    }
}