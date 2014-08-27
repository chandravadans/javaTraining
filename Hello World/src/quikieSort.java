import java.util.Scanner;


public class quikieSort {

		public static void main(String[] arr)
		{
			int noOfElements;
			Scanner io = new Scanner(System.in);
			
			noOfElements = io.nextInt();
		
			int A[] = new int[noOfElements];
//			int A[]={9,7,3,1,8,5};
			int pivotindex;
			int start=0;
			int end=5;
			
		}
		
		public static void quicksort(int A[], int start, int end)
		{
			if(start>end)
			{
				int pivotindex = partition(A,start,end);
				quicksort(A,start,pivotindex-1);
				quicksort(A,pivotindex+1,end);
			}
			
		}
		
		public static int partition(int A[],int low,int high)
		{
			int partitionindex=low;
			int pivotindex=high;
			
			for(int i=low;i<high-1;i++)
			{
				if(pivotindex>=A[i])
				{
					swap(A,i,partitionindex);
					partitionindex++;
				}
				swap(A,partitionindex,high);
			}
			
			return pivotindex;
		}
		
		public static void swap(int A[],int i,int partitionindex)
		{
			int temp;
			temp = A[i];
			A[i]=A[partitionindex];
			A[partitionindex]=temp;
		}
}
