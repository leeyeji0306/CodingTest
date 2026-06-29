class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int gap = 100000;
        for(int num : array){
            if(Math.abs(num-n) < gap){
                gap = (int)Math.abs(num-n);
                answer = num;
            }
            else if(Math.abs(num-n) == gap){
                if(num < answer){
                    answer = num;
                }
            }
        }
        return answer;
    }
}