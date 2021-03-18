package Matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrixMultiplication {
	
	public static void matrixMultiply(int [][]arr1,int r1,int c1,int [][]arr2,int r2,int c2)
	{
		int [][]product=new int [r1][c2];
		if(c1!=r2)
		{
			System.out.println("Invalid Input ");
			return ;
		}
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
					product[i][j]+=arr1[i][k]*arr2[k][i];
			}
		}
		
		for(int i=0;i<product.length;i++)
		{
			for(int j=0;j<product[0].length;j++)
			{
				System.out.print(product[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows");
		int row1=Integer.parseInt(br.readLine());
		System.out.println("Enter number of columns");
		int col1=Integer.parseInt(br.readLine());
		
		int [][]arr1=new int[row1][col1];
		System.out.println("Enter elements ");
		for(int i=0;i<row1;i++)
			for(int j=0;j<col1;j++)
				arr1[i][j]=Integer.parseInt(br.readLine());
		
		System.out.println("Enter number of rows");
		int row2=Integer.parseInt(br.readLine());
		System.out.println("Enter number of columns");
		int col2=Integer.parseInt(br.readLine());
		
		int [][]arr2=new int[row2][col2];
		System.out.println("Enter elements ");
		for(int i=0;i<row2;i++)
			for(int j=0;j<col2;j++)
				arr2[i][j]=Integer.parseInt(br.readLine());
		
		matrixMultiply(arr1,row1,col1,arr2,row2,col2);

	}

}
