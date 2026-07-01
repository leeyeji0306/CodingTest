import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        List<Character> keyList = new ArrayList<>(map.keySet());
        Collections.sort(keyList);
        String answer = "";
        for(Character key : keyList){
            if(map.get(key) == 1){
                answer+=key;
            }
        }
        
        return answer;
    }
}