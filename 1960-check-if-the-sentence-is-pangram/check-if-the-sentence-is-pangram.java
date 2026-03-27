class Solution {
    public boolean checkIfPangram(String sentence) {
        int max=26;
        int n=sentence.length();
     boolean vis[]=new boolean[max];
     for(int i=0;i<n;i++){
        char c=sentence.charAt(i);
        if(c>='a' && c<='z'){
            vis[c-'a']=true;
        }
     }   
     for(int i=0;i<max;i++){
        if(!vis[i]){
            return false;
        }
     }
        return true;
    }
}