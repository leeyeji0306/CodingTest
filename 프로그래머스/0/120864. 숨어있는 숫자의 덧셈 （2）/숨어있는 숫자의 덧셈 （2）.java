class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i=0; i<my_string.length(); i++){
            char c = my_string.charAt(i);
            if(Character.isDigit(c)){
                int temp = c-'0';
                int j=1;
                while(i+j < my_string.length() && Character.isDigit(my_string.charAt(i+j))){
                    temp= temp*10+(my_string.charAt(i+j)-'0');
                    j++;
                }
                i+=j;
                answer+=temp;
            }
            
        }
        return answer;
    }
}