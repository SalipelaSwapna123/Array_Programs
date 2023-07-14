package Arrays;

public class MinandMax {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= {1,5,8,88,222};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			
		}
		int min=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			
			if(arr[j]<min)
			{
				min=arr[j];
			}
			
		}
		System.out.println("Maximum Element : "+max);
		System.out.println("minimum Element : "+min);

	}

}
