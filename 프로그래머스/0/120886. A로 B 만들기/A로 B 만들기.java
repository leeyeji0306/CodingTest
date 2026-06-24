class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int[] beforeAlphabet = new int[26];
        int[] afterAlphabet = new int[26];
for(int i = 0; i<before.length(); i++){
            if(after.indexOf(before.charAt(i)) == -1) return answer;
            beforeAlphabet[(int)(before.charAt(i)-'a')]++;
            afterAlphabet[(int)(after.charAt(i)-'a')]++;
        }
        for(int i = 0; i<beforeAlphabet.length; i++){
            if(beforeAlphabet[i] != afterAlphabet[i]) return answer;
        }
        return 1;
    }
}