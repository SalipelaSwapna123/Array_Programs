import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		System.out.println("enter array size ");
		int size=sn.nextInt();
		int arr[]=new int[size];
		for (int i=0;i<size;i++)
		{
			System.out.println("enter the value of"+i+"th index");
			arr[i]=sn.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]+" ");
		}
				
		
		
		
	}

}
