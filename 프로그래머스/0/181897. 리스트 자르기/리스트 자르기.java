import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1]+1;
        int c =  slicer[2];
        switch(n){
            case 1:
                return Arrays.copyOf(num_list, b);
            case 2:
                return Arrays.copyOfRange(num_list, a, num_list.length);
            case 3:
                return Arrays.copyOfRange(num_list, a, b);
            default:
                List<Integer> list = new ArrayList<>();
                for(int i=a; i<b; i+=c){
                    list.add(num_list[i]);
                }
                int[] answer = new int[list.size()];
                for(int i=0; i<answer.length; i++){
                    answer[i] = list.get(i);
                }
                return answer;
        }
    }
}