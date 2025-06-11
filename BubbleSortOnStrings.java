package java_with_DSA;

public class BubbleSortOnStrings {

	public static void main(String[] args) {
		
		String[] nums= {"sunil","Ameen","Hasan","Hajarath","Moulali","Ameer"};
		System.out.println("Before Sorting Strings:");
		for(String num:nums) {
		System.out.print(num+ " ");
		}
		for(int i=0;i<nums.length-1;i++) {
			for(int j=0;j<nums.length-1-i;j++) {
				if(nums[j].compareTo(nums[j+1]) > 0) {
					String temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
				}
			}
		}
		System.out.println("\n After sorting the Strings:");
		for(String num:nums) {
			System.out.print(num+ " ");
			}

	}

}
