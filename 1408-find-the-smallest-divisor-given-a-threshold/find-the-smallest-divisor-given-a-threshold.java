class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1,high=max(nums),ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(sum(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
    public int sum(int[] nums,int div){
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=Math.ceil((double)((nums[i] + div - 1) / div));
            }
        return sum; 
        }
    public int max(int nums[]){
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
}