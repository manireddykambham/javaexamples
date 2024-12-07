package leetcode01;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        Set<Integer> remove = new HashSet<>();
        for(int num : nums)
        {
            remove.add(num);
        }
        return remove.size();
    }
}
