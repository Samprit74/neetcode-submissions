class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] ans=new int[2];
        for(int a=0;a<nums.length;a++){
            
            Integer ind= mp.getOrDefault(target-nums[a],-1);
            if(ind !=-1){
                ans[0]=ind;
                ans[1]=a;
                break;
            } 

            mp.put(nums[a],a);
        }

        if(nums[0]<nums[1]){
            int temp=nums[0];
            nums[0]=nums[1];
            nums[1]=temp;
        }
        return ans;
    }
}
