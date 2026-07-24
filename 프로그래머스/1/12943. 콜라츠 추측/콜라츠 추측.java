class Solution {
    public int solution(int num) {
        int answer = 0;
        long temp = num;
        //1. 입력된 수가 짝수라면 2로 나누고, 홀수라면 3을 곱하고 1을 더함.
        //2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복
        while(temp != 1){
            if(temp%2 == 0){
                temp/=2;
            }
            else{
                temp = temp * 3 + 1;
            }
            answer++;
            if(answer==500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}