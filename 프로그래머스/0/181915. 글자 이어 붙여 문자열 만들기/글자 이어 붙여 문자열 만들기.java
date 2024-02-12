class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<index_list.length; i++) {
            int index = index_list[i];
            sb.append(my_string.substring(index, index+1));
        }
        return sb.toString();
    }
}