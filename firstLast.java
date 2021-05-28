public class firstLast {
    public int[] searchRange(int[] nums, int target) {
        int n =nums.length;
        int[] range = {-1,-1};
         int start=0;
         int end=n-1;
         int s=0;
         int e=n-1;
         while(start<=end)
         {
             int mid=start+(end-start)/2;
             if(target==nums[mid]){
                 range[0]=mid;
             end=mid-1;
             }
             else if(target<nums[mid]){
                 end=mid-1;
             }
             else{
                 start=mid+1;
             }
         }
         while(s<=e)
         {
             int mid=s+(e-s)/2;
             if(target==nums[mid]){
                 range[1]=mid;
             s=mid+1;
             }
             else if(target<nums[mid]){
                 e=mid-1;
             }
             else{
                 s=mid+1;
             }
         }
         return range;
     }   
}
