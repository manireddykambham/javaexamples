package leetcode01;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int[] result = {0,0};
        for(int i=0; i<len-1;i++)
        {
            for(int j=i+1; j<len;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
