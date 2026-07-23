import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            }
            else{
                if(stack.peek() == arr[i]){
                    stack.pop();
                }
                else{
                    stack.push(arr[i]);
                }
            }
        }
        int[] answer = new int[stack.size()];
        if(stack.size() == 0){
            return new int[]{-1};
        }
        for(int i=stack.size()-1; i>=0; i--){
            answer[i] = stack.pop();
        }
        return answer;
    }
}