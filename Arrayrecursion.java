package rupak;
import java.util.*;
public class Arrayrecursion {
	static int arrayreverse(int a[],int n)
	{
		if(n==0)
			return a[0];
		
			System.out.println(arrayreverse(a,n-1));
	}
	public static void main(String args[])
	{
		int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
		int size = arr.length;
		arrayreverse(arr,size);
	}
}
