import java.util.*;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
         return new int[]{-1,-1};
    }
    public static void main(String[]args){
        Solution sol=new Solution();
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        int n=s.nextInt();
                int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
        }
        int res[]=sol.twoSum(nums,target);
        System.out.println(res);
    }
}
