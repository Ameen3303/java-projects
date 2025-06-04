package java_with_DSA;

public class BinarsearchExample {

	public static void main(String[] args) {
		
		int[] arr = {4,6,2,8,1,9,5};
		int target=9;
		int low=0;
		int high=arr.length-1;
		boolean found=false;
		while(low <= high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==target)
			{
				System.out.println(target +" at index "+mid);
				found=true;
				break;
			}
			else if(arr[mid] < target)
			{
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		if(!found)
			{
				System.out.println("numbers not found");
			}
			
		}
	}


