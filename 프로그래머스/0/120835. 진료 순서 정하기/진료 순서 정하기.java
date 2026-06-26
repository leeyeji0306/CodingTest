import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Integer[] temp = new Integer[emergency.length];
        for(int i=0; i<temp.length; i++){
            temp[i]=emergency[i];
        }
        int[] answer = new int[emergency.length];
        Arrays.sort(temp, Collections.reverseOrder());
        int j;
        int i;
        for(i=0; i<temp.length; i++){
            for(j=0; j<emergency.length; j++){
                if(temp[i] == emergency[j]) break;
            }
            answer[j]=i+1;
        }
        return answer;
    }
}