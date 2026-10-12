import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        String temp = "";
        for(int i=0; i<numbers.length(); i++){
            for(int j = i+1; j<numbers.length(); j++){
                String num = numbers.substring(i, j+1);
                if(map.containsKey(num)){
                    temp+=map.get(num);
                    j++;
                }
            }
            
        }
        answer = Long.parseLong(temp);
        return answer;
    }
}