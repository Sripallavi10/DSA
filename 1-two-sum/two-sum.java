class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> seen=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int more=target-nums[i];
        if(seen.containsKey(more)){
            return new int[]{seen.get(more),i};
        }
        seen.put(nums[i],i);
       }
       return new int[]{};
    }
}