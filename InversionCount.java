package Arrays;

public class InversionCount {
	static int [] arr= {2,9,3,5,7,6};
	public static void countInversion(int [] arr)
	{
		int invCount=0;
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
					invCount++;
			}
		}
		
		System.out.println("Inversion Count for the array "+invCount);
	}
	

	public static void main(String[] args) {
		countInversion(arr);

	}

}
