import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1) {
            if(n%2 == 0) {
                // 짝수
                n /= 2;
            } else {
                //홀수
                n *= 3;
                n += 1;
            }
            list.add(n);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}