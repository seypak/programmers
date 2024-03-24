class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<myString.length(); i++) {
            String str = String.valueOf(myString.charAt(i));
            if("a".equals(str) || "A".equals(str)) {
                sb.append(str.toUpperCase());
            } else {
                sb.append(str.toLowerCase());
            }
        }
        return sb.toString();
    }
}