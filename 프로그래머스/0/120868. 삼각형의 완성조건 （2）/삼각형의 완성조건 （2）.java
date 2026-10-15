class Solution {
    public int solution(int[] sides) {
        int answer=0;
        int max=0;
        int min=0;
        if(sides[0]>sides[1]){
            max = sides[0];
            min = sides[1];
        }
        else{
            max = sides[1];
            min = sides[0];
        }
        for(int i=1; i<=max; i++){
            if(min+i > max){
                answer++;
                System.out.println(i);
            }
        }
        for(int i=max+1; i<=max+min; i++){
            if(i < max+min){
                answer++;
                System.out.println(i);
            }
        }
        return answer;
    }
}