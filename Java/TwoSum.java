class TwoSum{
    public static void main(String[] args){
        int[] nums = {2, 7, 11,15};
        int target = 9;
        Solution solu = new Solution();
        int[] results = solu.twoSum(nums, target);
        for(int result: results){
            System.out.println(result);
        }
    }

    public static class Solution {
        public int[] twoSum(int[] nums, int target){
            for(int index = 0;index < nums.length; index++){
                for(int jindex = index +1; jindex < nums.length; jindex++){
                    if(nums[index] + nums[jindex] == target){
                        return new int[]{index, jindex};
                    }
                }
            }
            return null;
        }
    }
}
