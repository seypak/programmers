class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<myString.length(); i++){
            String x = String.valueOf(myString.charAt(i));
            if(x.equals("A")) {
                sb.append("B");
            } else {
                sb.append("A");
            }
        }
        return sb.toString().contains(pat) ? 1 : 0;
    }
}