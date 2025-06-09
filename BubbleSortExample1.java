package java_with_DSA;

public class BubbleSortExample1 {

	public static void main(String[] args) {
		int[] Studentnums= {3309,3305,3301,3314,3319,3333};
		for(int i=0;i<Studentnums.length-1;i++) {
			for(int j=0;j<Studentnums.length-1;j++) 
			{
				if(Studentnums[j] > Studentnums[j+1])
				{
				int temp=Studentnums[j];
				Studentnums[j]=Studentnums[j+1];
				Studentnums[j+1]=temp;
			}
			}
		}
		System.out.println(" sorted Student numbers:");
		for(int num:Studentnums) {
			System.out.println(num+ " ");
		}
	}

}
