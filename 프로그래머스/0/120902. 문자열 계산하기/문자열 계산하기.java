class Solution {
    public int solution(String my_string) {
        int i=0;
        String temp = "";
        //첫 숫자 answer에 저장
        while(Character.isDigit(my_string.charAt(i))){
            temp += my_string.charAt(i);
            i++;
        }
        int answer = Integer.parseInt(temp);
        //+나 -가 나왔을 때
        //그 다음에 있는 숫자 찾아서 그 숫자 + or -
        int count = 1;
        for(i=1; i<my_string.length(); i+=count){
            count=1;
            char now = my_string.charAt(i);
            if(now == ' ') continue;
            if(now == '+'){
                while(i+count+2 < my_string.length() && Character.isDigit(my_string.charAt(i+count+2))){
                    count++;
                }
                answer += Integer.parseInt(my_string.substring(i+2, i+count+2));
            }
            else if(now == '-'){
                while(i+count+2 < my_string.length() && Character.isDigit(my_string.charAt(i+count+2))){
                    count++;
                }
                answer -= Integer.parseInt(my_string.substring(i+2, i+count+2));
            }
        }
        return answer;
    }
}