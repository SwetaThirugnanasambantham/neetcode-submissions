class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                flag = true;
            }
            else{
                hs.add(nums[i]);
            }
        }
        return flag;
    }
}