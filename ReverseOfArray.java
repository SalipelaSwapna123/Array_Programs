package Arrays;



public class Array {
	
	static void  ReverseOfArray (int arr[],int start,int end)
	{
		int temp;
		while(start<end)
		{
		temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	}
	public static void printarray(int arr[],int size){
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		
	}
		

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		printarray(arr,6);
		System.out.println("reverse of array : ");
		ReverseOfArray(arr,0,5);
		
		printarray(arr,6);
		
		

	}

}
