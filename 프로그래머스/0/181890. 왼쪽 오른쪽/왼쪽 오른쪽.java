import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        List<String> list = new ArrayList<>();
        int r = -1;
        int l = -1;
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("l")){
                l = i;
                break;
            }
            else if(str_list[i].equals("r")){
                r = i;
                break;
            }
        }
        
        if(r != -1){
            for(int i = r+1; i < str_list.length; i++){
                list.add(str_list[i]);
            }
        }
        else if(l != -1){
            for(int i = 0; i < l; i++){
                list.add(str_list[i]);
            }
        }
        String[] answer = list.toArray(new String[0]);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}