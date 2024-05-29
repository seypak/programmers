class Solution {
    public int solution(int a, int b) {
        if( !(test(a) || test(b)) ) {
            return a*a + b*b;
        } else if ( test(a) && test(b) ) {
            return Math.abs(a-b);
        } else {
            return 2*(a+b);
        }
    }
    
    private boolean test(int a) {
        return a%2 == 0 ? true : false;
    }
}