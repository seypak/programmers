class Solution {
    public int solution(String myString, String pat) {
        int count =0;
        while(myString.contains(pat)) {
            int index = myString.indexOf(pat);
            myString = myString.substring(index+1);
            count++;
        }
        return count;
    }
}