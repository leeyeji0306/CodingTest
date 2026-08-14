import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() != 4){
            if(s.length() != 6){
                answer = false;
                return answer;
            }
        }
        for(int i=0; i<s.length(); i++){
            char now = s.charAt(i);
            if(!Character.isDigit(now)){
                answer = false;
            }
        }   
        
        return answer;
    }
}