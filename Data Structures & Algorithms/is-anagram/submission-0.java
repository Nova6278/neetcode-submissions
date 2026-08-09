class Solution {
    public boolean isAnagram(String s, String t) {
        int[] boxes=new int[26];
        if(s.length()!=t.length())
            return false;
        for(char c:s.toCharArray()){
            boxes[c-'a']++;
        }
        for(char c:t.toCharArray()){
            boxes[c-'a']--;
        }
        for(int n:boxes){
            if(n!=0)
                return false;
        }
        return true;
    }
}
