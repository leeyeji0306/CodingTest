import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        for(char c : arr){
            answer.insert(0, c);
        }
        return answer.toString();
    }
}