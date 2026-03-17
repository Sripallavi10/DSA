class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if ((long) m * k > n) return -1;

        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
        for (int d : bloomDay) {
            low = Math.min(low, d);  
            high = Math.max(high, d); 
        }

        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public boolean possible(int[] num, int day, int m, int k) {
        int cnt = 0, bouquets = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] <= day) {
                cnt++;
            } else {
                bouquets += (cnt / k); 
                cnt = 0;
            }
        }
        bouquets += (cnt / k); 
        return bouquets >= m;
    }
}