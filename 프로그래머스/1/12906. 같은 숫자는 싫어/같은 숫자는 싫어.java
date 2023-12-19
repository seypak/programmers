import java.util.*;

public class Solution {
    public int[] solution(int [] arr) {
    
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++) {
            int temp = arr[i];
            if(i == 0)  {
                stack.push(temp);
                continue;
            }
            if(stack.peek() == temp) {
                continue;
            } else {
                stack.push(temp);
            }
        }
        
        return stack.stream().mapToInt(i -> i).toArray();
    }
}