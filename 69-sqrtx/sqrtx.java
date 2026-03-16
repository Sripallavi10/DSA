class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long low=1,high=x/2;
        int ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long sq=mid*mid;
            if(sq==x){
                return (int)mid;
            }else if(sq<x){
                ans=(int)mid;
                low=mid+1;
            }else {
                high=mid-1;
            }

        }
        return ans;
    }
}