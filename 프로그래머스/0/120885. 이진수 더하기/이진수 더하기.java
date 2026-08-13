class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        long long1 = 0;
        long long2 = 0;
        for(int i=0; i<bin1.length(); i++){
            char now = bin1.charAt(i);
            if(now == '1'){
                long1 += (long)Math.pow(2, bin1.length()-i-1);
            }
        }
        System.out.println(long1);
        for(int i=0; i<bin2.length(); i++){
            char now = bin2.charAt(i);
            if(now == '1'){
                long2 += (long)Math.pow(2, bin2.length()-i-1);
            }
        }
        System.out.println(long2);
        long sum = long1+long2;
        StringBuilder sb = new StringBuilder();
        if(sum % 2 == 1){
            sb.append('1');
        }
        else{
            sb.append('0');
        }
        while(sum > 0){
            if(sum%2==1){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
            sum/=2;
        }
        sb.deleteCharAt(0);
        answer = sb.reverse().toString();
        if(answer.length() == 0){
            answer+='0';
        }
        return answer;
    }
}