class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        char temp2 = (char)(k+'0');
        for(int index = i; index<=j; index++){
            String[] temp = Integer.toString(index).split("");
            for(int index2 = 0; index2 < temp.length; index2++){
                if(temp[index2].indexOf(temp2) != -1){
                    answer++;
                }
            }
        }
        return answer;
    }
}