class Solution {
    public int solution(String myString, String pat) {
        String a = myString.toUpperCase();
        String b = pat.toUpperCase();
        
        if(a.indexOf(b) > -1) {
            return 1;
        } else {
            return 0;
        }
    }
}