import java.util.*;

class Solution {
    public boolean solution(String s) {
        return checkLength(s) && checkNumber(s);
    }
    
    public boolean checkLength(String s) {
        return s.length() == 4 || s.length() == 6 ? true : false;
    }
    
    public boolean checkNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}