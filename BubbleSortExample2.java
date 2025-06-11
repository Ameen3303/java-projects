package java_with_DSA;

import java.util.Arrays;

public class BubbleSortExample2 {

	public static void main(String[] args) {
		
		int[] nums= {5,3,8,4,2};
		System.out.println("Before sorting elemenmts into Ascending order:");
		System.out.println(Arrays.toString(nums));
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j] > nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println("Afetr sorting elemenmts into Ascending order:");
		for(int num:nums) {
			System.out.print(num+" ");
		}
		
		
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1;j++) {
				if(nums[j] < nums[j+1]) {
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		System.out.println("\n Afetr sorting elemenmts into Deascending order:");
		for(int num:nums) {
			System.out.print(num+" ");
		}
	}

}
