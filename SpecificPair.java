package Matrices;

public class SpecificPair {
	
	public static int findPair(int [][]mat,int row,int col)
	{
		int maxValue=Integer.MIN_VALUE;
		int pair1 = 0;
		int pair2=0;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				for(int k=i+1;k<row;k++)
				{
					for(int l=j+1;l<col;l++)
					{
						if(maxValue<(mat[k][l]-mat[i][j]))
						{
							pair1=mat[i][j];
							pair2=mat[k][l];
							maxValue=pair2-pair1;
						}
					}
				}
			}
		}
		System.out.println("Following elements  are "+pair1 +" and "+pair2);
		return maxValue;
	}

	public static void main(String[] args) {
		 int mat[][] = { 
                           { 1, 2, -1, -4, -20 }, 
                           { -8, -3, 4, 2, 1 }, 
                           { 3, 8, 6, 1, 3 }, 
                           { -4, -1, 1, 7, -6 }, 
                           { 0, -4, 10, -5, 1 } 
                        };
		 
		 int row=mat.length;
		 int col=mat[0].length;
		 
		 System.out.println("Maximum differenece between a pair in the matrix is "+findPair(mat,row,col));

	}

}
