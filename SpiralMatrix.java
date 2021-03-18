package Matrices;

public class SpiralMatrix {
	
	public static void spiralTraversal(int [][] arr,int top,int bottom,int left,int right)
	{
		if(left>right)
			return;
		
		for(int i=left;i<=right;i++)
		{
			System.out.print(arr[top][i]+" ");
		}
		top++;
		if(top > bottom)
			return;
		for(int i=top;i<=bottom;i++)
			System.out.print(arr[i][right]+" ");
		right--;
		
		if(left>right)
			return ;
		for(int i=right;i>=left;i--)
			System.out.print(arr[bottom][i]+" ");
		bottom--;
		
		if(top>bottom)
			return;
		
		for(int i=bottom;i>=top;i--)
			System.out.print(arr[i][left]+" ");
		left++;
		
		spiralTraversal(arr,top,bottom,left,right);
	}

	public static void main(String[] args) {
		int [][] arr={ { 1, 2, 3, 4, 5, 6 },
                     { 7, 8, 9, 10, 11, 12 },
                     { 13, 14, 15, 16, 17, 18 } };
		int top=0;
		int bottom=arr.length-1;
		int left=0;
		int right=arr[0].length-1;
		
		
		System.out.println("Spiral Traversal of a matrix : ");
		spiralTraversal(arr,top,bottom,left,right);

	}

}
