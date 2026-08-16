class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums) set.add(n);

        int longest=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int length=1,current=num;
                while(set.contains(current+1)){
                    current++;
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
    }
}
