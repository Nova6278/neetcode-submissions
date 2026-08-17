class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1,area=0,max=0;
        for(int i=0;i<heights.length;i++){
            area=Math.min(heights[l],heights[r])*(r-l);
            max=Math.max(max,area);
            if(heights[l]<heights[r]) l++;
            else r--;
        }
        return max;
    }
}
