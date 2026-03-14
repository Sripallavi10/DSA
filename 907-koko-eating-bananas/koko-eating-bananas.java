class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //int n=piles.length;
        int low=1;
        int high=max(piles);
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int time=answer(piles,mid);
            if(time<=h){
                ans=mid;
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return ans;
    }
public int answer(int arr[],int mid){
    int time=0;
    for(int ele:arr){
        time+=Math.ceil(ele/(mid*(1.0)));
    }
    return time;
}
public int max(int arr[]){
    int maxi=Integer.MIN_VALUE;
    int n=arr.length;
    for(int i=0;i<n;i++){
        maxi=Math.max(maxi,arr[i]);
    }
    return maxi;
    }
}