package Matrices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class maxRectangleProblem {
	
	public static int maxHist(int []arr,int r,int c)
	{
		int maxarea=Integer.MIN_VALUE;
		int top;
		int area;
		
		Stack<Integer>st=new Stack<>();
		int i=0;
		
		while(i<c)
		{
			if(st.empty() ||arr[st.peek()]<=arr[i])
			{
				st.push(i++);
			}
			else
			{
				top=st.peek();
				st.pop();
				
				area=arr[top]*(st.empty()?i:i-st.peek()-1);
				
				maxarea=Math.max(maxarea,area);
				
			}
		}
		
		while(st.empty()==false)
		{
			top=st.peek();
			st.pop();
			area=arr[top]*(st.empty()?i:i-st.peek()-1);
			
			maxarea=Math.max(area,maxarea);
		}
		return maxarea;                                            /*  { 0, 1, 1, 0 },
                                                                       { 1, 1, 1, 1 },
                                                                       { 1, 1, 1, 1 },
                                                                       { 1, 1, 0, 0 },   */
	}
	
	public static int maxRectangle(int [][]arr,int row,int col)
	{
		int res=maxHist(arr[0],row,col);
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]==1)
				{
					arr[i][j]+=arr[i-1][j];
				}
				
				res=Math.max(res, maxHist(arr[i],row,col));
			}
		}
		
		return res;
	}

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows");
		int row=Integer.parseInt(br.readLine());
		System.out.println("Enter number of columns ");
		int col=Integer.parseInt(br.readLine());
		
		int [][]arr=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Area of maximum rectangle is "+maxRectangle(arr,arr.length,arr[0].length));
		

	}

}
