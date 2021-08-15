public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    void reverse(int[] nums,int low,int high){
       while(low<high){
           int m=nums[low];
           nums[low]=nums[high];
           nums[high]=m;
           low++;
           high--;
       } 
    }
}
