import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result.toString());
        Integer[] temp = result.toArray(new Integer[0]);
        for(int i=0; i<temp.length; i++){
            answer[i] = temp[i];
            if(i == k-1) break;
        }
        return answer;
    }
}