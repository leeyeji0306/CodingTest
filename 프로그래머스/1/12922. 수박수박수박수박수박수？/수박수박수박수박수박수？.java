class Solution {
    public String solution(int n) {
        String answer = "";
        char[] watermelon = {'수', '박'};
        for(int i=0; i<n; i++){
            answer+=watermelon[i%watermelon.length];
        }
        return answer;
    }
}