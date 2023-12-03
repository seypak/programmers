class Solution {
    public String solution(String phone_number) {
        String answer = "";
        StringBuilder sb = new StringBuilder(phone_number);
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<phone_number.length()-4; i++) {
            sb2.append("*");
        }
        sb.replace(0, phone_number.length()-4, sb2.toString());
        return sb.toString();
    }
}