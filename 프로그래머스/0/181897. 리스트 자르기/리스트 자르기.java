import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n == 1) {
            for(int i=0; i<=b; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 2) {
            for(int i=a; i<num_list.length; i++) {
                list.add(num_list[i]);
            }
        } else if (n == 3) {
            for(int i=a; i<=b; i++) {
                list.add(num_list[i]);
            }
        } else {
            for(int i=a; i<=b; i++) {
                if(a%c != i%c) {
                    continue;
                }
                list.add(num_list[i]);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}