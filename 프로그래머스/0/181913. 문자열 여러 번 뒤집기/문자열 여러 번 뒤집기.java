import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        char[] charArr = my_string.toCharArray();
        
        for(int i=0; i<queries.length; i++){
            // queries의 범위만큼의 문자열을 StringBuilder에 담고
            String temp = answer.substring(queries[i][0], queries[i][1]+1);
            StringBuilder now = new StringBuilder(temp);
            // reverse하고
            now.reverse();
            // 변경된 내용을 다시 넣기
            int count = 0;
            for(int j=queries[i][0]; j <= queries[i][1]; j++){
                answer.setCharAt(j, now.charAt(count));
                count++;
            }
        }
        return answer.toString();
    }
}