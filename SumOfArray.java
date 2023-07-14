package Arrays;
import java.util.*;
public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size :");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter "+i+"th element");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum of elements in array :"+sum);
	}

}
