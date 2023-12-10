class Solution {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            String sStr = String.valueOf(s.charAt(i));
            if(sStr.equals(" ")) {
                index = 0;
                sb.append(sStr);
                continue;
            } else if(index == 0 || (index % 2 == 0)) {
                sb.append(sStr.toUpperCase());
            } else if (index % 2 != 0) {
                sb.append(sStr.toLowerCase());
            }
            index++;
        }
        return sb.toString();
    }
}