import java.util.*;
class Solution {
    public String solution(String myString) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<myString.length(); i++) {
            char c = myString.charAt(i);
            if(list.contains(c)) {
                sb.append("l");
            } else {
                sb.append(String.valueOf(c));
            }
        }
        return sb.toString();
    }
}