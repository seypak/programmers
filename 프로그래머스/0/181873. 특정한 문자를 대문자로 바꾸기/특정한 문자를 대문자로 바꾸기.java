class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            String str = String.valueOf(my_string.charAt(i));
            if(alp.equals(str)) {
                sb.append(str.toUpperCase());
            } else {
                sb.append(str);
            }
        }
        return sb.toString();
    }
}