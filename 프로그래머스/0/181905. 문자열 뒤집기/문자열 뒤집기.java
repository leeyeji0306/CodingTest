import java.util.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer="";
        String frontTemp = my_string.substring(0, s);
        String temp = my_string.substring(s, e+1);
        String backTemp = my_string.substring(e+1, my_string.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<temp.length(); i++){
            char currentChar = temp.charAt(i);
            sb.insert(0, currentChar);
        }
        answer=frontTemp+sb.toString()+backTemp;
        return answer;
    }
}