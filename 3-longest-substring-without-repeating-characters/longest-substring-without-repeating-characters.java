class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        Set<Character> st=new HashSet<>();
        while(r<s.length()){
            if(!st.contains(s.charAt(r))){
                st.add(s.charAt(r));
                r++;
                max=Math.max(st.size(),max);
            }else {
                st.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}