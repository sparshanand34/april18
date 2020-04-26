package Sparsh;

public class Commomelements {
	public static void main(String arg[]) {
		int arr1[]= {1,4,2,6,-1,10};
		int arr2[]= {3,4,-1,7,8};
		
		for(int n1:arr1)
		{
			for(int n2:arr2)
			{
				if(n1==n2)
					System.out.println(n1);
			}
		}
	}

}