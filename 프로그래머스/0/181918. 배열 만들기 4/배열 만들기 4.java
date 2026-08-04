import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Deque<Integer> stk = new ArrayDeque<>();
        int i=0;
        while(true){
            if(i == arr.length) break;
            if(stk.isEmpty()){ // stk 비었음? ㅇㅇ => arr[i]를 stk에 추가, i++
                stk.add(arr[i++]);
            }
            else if(stk.peekLast() < arr[i]){ // stk 비었음? ㄴㄴ, stk의 peek < arr[i] => arr[i]를 stk 뒤에 추가, i++
                stk.add(arr[i++]);
            }
            else{ // stk 비었음? ㄴㄴ, stk의 peek >= arr[i] => stk.pop();
                stk.removeLast();
            }
        }
        int[] answer = new int[stk.size()];
        
        for(i=0; i<answer.length; i++){
            answer[i] = stk.removeFirst();
        }
        return answer;
    }
}