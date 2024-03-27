class Solution {
    public String solution(String myString, String pat) {
        int len = pat.length();
        return myString.substring(0, myString.lastIndexOf(pat)+len);
    }
}