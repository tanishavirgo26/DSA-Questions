public class RemoveDuplicates {
    public int removeDuplicatesSorted(int[] nums) {
        if(nums.length==0)
            return 0;
        int length=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != nums[length])
            {
                length++;
                nums[length]=nums[i];
            }
        }
        return length+1;    
    }  
}
