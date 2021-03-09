package Arrays;

public class findDuplicates {
	
	public static void findDuplicatesInAnArray(int [] arr,int size)
	{
		for(int i=0;i<size;i++)
		{
			int j=Math.abs(arr[i]);
			if(arr[j]>=0)
				arr[j]=-arr[j];
			else
				System.out.print(j+" ");
		}
	}
		
//		int index;
		
//		for(int i=0;i<size;i++)
//		{
//			index=arr[i]%size;
//			arr[index]+=size;
//		}
		
		//for(int i=0;i<size;i++)
		//	System.out.print(arr[i]+" ");
		
//		for(int i=0;i<size;i++)
//		{
//			if((arr[i]/size)>=2)
//				System.out.print(" "+i);
//		}
	

	public static void main(String[] args) {
		int [] arr=new int[] {1,6,3,1,3,2,4,4};
		int size=arr.length;
		findDuplicatesInAnArray(arr,size);

	}

}
