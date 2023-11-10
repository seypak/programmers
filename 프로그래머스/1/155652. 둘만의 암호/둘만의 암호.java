class Solution {
    public String solution(String s, String skip, int index) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<skip.length(); i++) {
            String skipStr = String.valueOf(skip.charAt(i));
            alphabet = alphabet.replace(skipStr, "");
        }
        
        int len = alphabet.length();
        StringBuilder sb = new StringBuilder();        
        for(int i=0; i<s.length(); i++) {
            int targetIndex = alphabet.indexOf(String.valueOf(s.charAt(i))) + index;
            // if(targetIndex >= len) {
            //     targetIndex -= len;
            // }
            while(targetIndex >= len) {
                targetIndex -= len;
            }
            sb.append(String.valueOf(alphabet.charAt(targetIndex)));
        }
        
        return sb.toString();
    }
}