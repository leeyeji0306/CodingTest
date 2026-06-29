class Solution {
    public int solution(int n) {
        int answer = 1;
        int i=1;
        while(true){
            i++;
            answer*=i;
            if(answer >= n) break;
        }
        if(answer > n) i--;
        return i;
    }
}