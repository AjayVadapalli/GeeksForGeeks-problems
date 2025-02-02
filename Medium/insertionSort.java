//{ Driver Code Starts
import java.util.*;

class insertionSort
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			int t= sc.nextInt();
			while(t>0)
			{
				int n = sc.nextInt();
				int a[] = new int[n];
			
				for(int i=0;i<n;i++)
				a[i]= sc.nextInt();
				
				 new Solution().insertionSort(a,n);
				 printArray(a,n);
				
			t--;
			}
		}
		
	}
}
// } Driver Code Ends


class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
        int key = arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j=j-1;
        }
        arr[j+1]=key;
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          insert(arr,i);
      }
      
  }
}