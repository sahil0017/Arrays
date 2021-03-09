package Arrays;

//  FOR CYCLICALLY ROTATE AN ARRAY ONE BY ONE 

import java.util.Arrays;
public class cyclicallyrotationOfArrays {
	static int []array= {1,4,3,5,2,5};
	
	public static void rotateCyclic()
	{
		int x=array.length-1;
		for(int i=array.length-1;i>0;i--)
		{
			array[i]=array[i-1];
		}
		array[0]=x;
	}

	public static void main(String[] args) {
		System.out.println("Given arrays ");
		System.out.println(Arrays.toString(array));
		
		rotateCyclic();
		
		System.out.println("Rotated array look like ");
		System.out.println(Arrays.toString(array));
		

	}

}
