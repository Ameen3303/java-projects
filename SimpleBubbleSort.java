package java_with_DSA;

public class SimpleBubbleSort {

	public static void main(String[] args) {
		
		int [] numbers= {4,2,7,1,3};
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=0;j<numbers.length-1;j++) {
				//if the number is bigger than next one, then swap them
				if(numbers[j] > numbers[j+1]) {
					//swapping
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
					
				}
			}

		}
		//print the sorted numbers
		System.out.println("Sorted list:");
		for(int num:numbers) {
			System.out.print(num + " ");
		}
	}

}
