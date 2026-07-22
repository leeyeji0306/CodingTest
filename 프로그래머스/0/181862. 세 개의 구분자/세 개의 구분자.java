import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<myStr.length(); i++){
            String temp = "";
            int j;
            for(j=i; j<myStr.length(); j++){
                char current = myStr.charAt(j);
                if(current == 'a' || current == 'b'|| current == 'c')
                    break;
                temp += current;
            }
            if(temp.length() != 0)list.add(temp);
            i=j;
        }
        String[] answer = list.toArray(new String[1]);
        if(list.size() == 0){
            answer[0] = "EMPTY";
        }
        return answer;
    }
}