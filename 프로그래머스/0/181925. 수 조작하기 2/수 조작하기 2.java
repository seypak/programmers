class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        
        int beforeNum = numLog[0];
        for(int i=1; i<numLog.length; i++) {
            int num = numLog[i];
            int diff = num - beforeNum;
            if(diff == 1) {
                sb.append("w");
            } else if (diff == -1) {
                sb.append("s");
            } else if (diff == 10) {
                sb.append("d");
            } else {
                sb.append("a");
            }
            beforeNum = num;
        }
        return sb.toString();
        
    }
}