package Matrices;

import java.util.HashMap;
import java.util.Map;

public class commonElements {
	
	public static int findCommon(int [][]mat,int row,int col)
	{
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<row;i++)
		{
			if(map.containsKey(mat[i][0]))
			{
				map.put(mat[i][0], map.get(mat[i][0])+1);
			}
			else
				map.put(mat[i][0], 1);
			
			for(int j=1;j<col;j++)
			{
				if(mat[i][j]!=mat[i][j-1])
				{
					if(map.containsKey(mat[i][j]))
					{
						map.put(mat[i][j],map.get(mat[i][j])+1);
					}
					else
					{
						map.put(mat[i][j],1);
					}
				}
			}
			
			for(Map.Entry<Integer, Integer>element:map.entrySet())
			{
				if(element.getValue()==row)
					return element.getKey();
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int mat[][] = {{ 1, 2, 3, 4, 5 }, 
                       { 2, 4, 5, 8, 10 }, 
                       { 3, 5, 7, 9, 11 }, 
                       { 1, 3, 5, 7, 9 }  }; 
		int row=mat.length;
		int col=mat[0].length;
		
		int res=findCommon(mat,row,col);
		if(res==-1)
			System.out.println("No common Elements");
		else
			System.out.println("Common Element present is "+res);

	}

}
