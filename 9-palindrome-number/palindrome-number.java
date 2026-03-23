class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        long rev=0;
        long org=x;
        while(org>0){
            int ld=(int)org%10;
            rev=rev*10+ld;
            org=org/10;
        }
        return (rev==x);
    }
}