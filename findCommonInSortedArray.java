package Arrays;
//FIND COMMON  IN THE 3 SORTED ARRAY
public class findCommonInSortedArray {
	public static void findCommon(int []arr1,int []arr2,int []arr3)
	{
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length && k<arr3.length)
		{
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k])
			{
				System.out.println(arr1[i]+" ");
				i++;
				j++;
				k++;
			}
			else if(arr1[i]<arr2[j])
				i++;
			else if(arr2[j]<arr3[k])
				j++;
			else
				k++;
		}
	}

	public static void main(String[] args) {
		int [] arr1= {10,20,30,50};
		int [] arr2= {10,30,40};
		int arr3[]= {30,40,60};
		findCommon(arr1,arr2,arr3);

	}

}
