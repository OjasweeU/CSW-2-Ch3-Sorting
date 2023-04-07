package Problems;

public class MergeSort 
{
	 static void Divide(int array[],int start, int end)
	 {
		 if(start>=end)
		 {
		     return;
		 }
		 int mid = start+(end-start)/2;
		 Divide(array, start, mid);
		 Divide(array, mid+1, end);
		 Conqure(array, start, mid, end);
	 }

	 static void Conqure(int array[],int start , int mid , int end)
	 {
		int mergedArray [] = new int [(end-start)+1];
	    int index1 = start;
		int index2 = mid+1;
		int x=0;
		while(index1<=mid && index2<=end)
		{
		 if(array[index1]<=array[index2])
		 {
		     mergedArray[x++]=array[index1++];
		 }
		 else
		 {
		     mergedArray[x++]=array[index2++];
		 }
	    }
		         
		while(index1<=mid)
		{
		  mergedArray[x++]=array[index1++];
		}
	    while(index2<=end)
	    {
		  mergedArray[x++]=array[index2++];
		}
		for(int i=0,j=start;i<mergedArray.length;i++,j++)
		{
		  array[j]=mergedArray[i];
	    }
   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array [] = {8,9,0,5,7,6,3,4,2};
	      Divide(array, 0, array.length-1);
	      for(int elements : array)
	      {
	         System.out.print(array[elements] + " ");
	       }
	}

}
