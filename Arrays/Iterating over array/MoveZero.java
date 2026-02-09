import java.util.*;
class MoveZero{
	public static void main(String[] args) {
        int []nums={4,0,2,0,1,0,3,0};
        System.out.println(Arrays.toString(nums));
        moveZeroes(nums);

    }
	public static void moveZeroes(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int i=k;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
	}
}