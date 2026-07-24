class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] upper = {'A', 'B', 'C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] lower = {'a', 'b', 'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c >= 'A' && c <='Z'){
                answer+=upper[(c-'A'+n)%26];
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <='z'){
                answer+=lower[(c-'a'+n)%26];
            }
            else{
                answer+=c;
            }
        }
        return answer;
    }
}