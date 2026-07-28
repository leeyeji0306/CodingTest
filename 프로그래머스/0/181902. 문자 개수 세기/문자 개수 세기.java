import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(int i=0; i<my_string.length(); i++){
            char current = my_string.charAt(i);
            // A = 65, a = 97
            if(current - 'A' >= 32){
                answer[current - 'A' - 6]++;
            }
            else {
                answer[current - 'A']++;
            }
        }
        return answer;
    }
}