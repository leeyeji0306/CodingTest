class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int num : array){
            String strNum = String.valueOf(num);
            for(int i=0; i<strNum.length(); i++){
                char c = strNum.charAt(i);
                if(c == '7'){
                    answer++;
                }
            }
        }
        return answer;
    }
}