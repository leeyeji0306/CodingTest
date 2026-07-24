import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        Integer[] temp = set.toArray(new Integer[0]);
        int[] answer = new int[temp.length];
        Arrays.sort(temp);
        for(int i=0; i<temp.length; i++){
            answer[i]=temp[i];
        }
        return answer;
    }
}