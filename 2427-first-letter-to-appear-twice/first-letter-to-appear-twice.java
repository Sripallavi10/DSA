class Solution {
    public char repeatedCharacter(String s) {
        char[] cnt=new char[26];
        for(char ch:s.toCharArray()){
            int idx=ch-'a';
            cnt[idx]++;
        if(cnt[idx]==2){
            return ch;
        }
        }
        return 0;
    }
}