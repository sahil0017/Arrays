package Arrays;

import java.util.HashMap;
import java.util.Map;

public class elementsWithMoreThanNK {
	
	public static void elementsMoreThanNK(int [] arr,int n,int k)
	{
		int x=n/k;
		Map<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(!map.containsKey(arr[i]))
				map.put(arr[i], 1);
			else
			{
				int count=map.get(arr[i]);
				map.put(arr[i], count+1);
			}
		}
		
		for(Map.Entry<Integer,Integer> m:map.entrySet())
		{
			Integer temp=(Integer)m.getValue();
			if(temp>x)
				System.out.print(m.getKey()+" ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,2,3,9,2,3,7};
		int n=arr.length;
		int k=4;
		System.out.println("Elements with more than n/k is ");
		elementsMoreThanNK(arr,n,k);

	}

}
