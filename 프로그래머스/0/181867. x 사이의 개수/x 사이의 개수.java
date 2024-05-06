import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x", -1);
        System.out.println(Arrays.toString(arr));
        return Arrays.stream(arr).mapToInt(x -> x.length()).toArray();
    }
}