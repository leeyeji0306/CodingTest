class Solution {
    public int solution(int[] numbers, int k) {
        int answerPos = 0;
        int count = 1;
        while(true){
            if(count == k) break;
            count++;
            answerPos+=2;
            if(answerPos >= numbers.length){
                answerPos-=numbers.length;
            }
        }
        int answer = numbers[answerPos];
        return answer;
    }
}