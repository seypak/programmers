import java.util.*;
import java.util.stream.*;


class Solution {
    public String solution(String my_string, int[] indices) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<my_string.length(); i++) {
            list.add(String.valueOf(my_string.charAt(i)));
        }
        
        Integer[] arr = Arrays.stream(indices).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++) {
            int index = arr[i];
            list.remove(index);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            String str = list.get(i);
            sb.append(str);
        }
        return sb.toString();
    }
}