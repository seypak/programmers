class Solution {
    public String solution(String n_str) {
        int index = -1;
        for(int i=0; i<n_str.length(); i++) {
            String str = String.valueOf(n_str.charAt(i));
            if(!"0".equals(str)) {
                index = i;
                break;
            }
        }
        return index != -1 ? n_str.substring(index) : n_str;
    }
}