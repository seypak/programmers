import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length(); i++) {
            String aStr = String.valueOf(a.charAt(i));
            if(aStr.toUpperCase() == aStr) {
                sb.append(aStr.toLowerCase());
            } else {
                sb.append(aStr.toUpperCase());
            }
        }
        System.out.println(sb.toString());
    }
}