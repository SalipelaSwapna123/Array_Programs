package Arrays;

public class FindLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,5,8,88,222};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		System.out.println("largest Element : "+max);
	}

}
