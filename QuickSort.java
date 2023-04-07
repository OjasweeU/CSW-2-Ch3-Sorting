package Problems;
import java.util.Arrays;
public class QuickSort 
{
    static int partition(int array[], int low, int high)
    {
    	int pivot=array[high];
    	int i=(low-1);
    	for(int j = low; j < high; j++)
    	  {
    	     if(array[j] <= pivot) 
    	       {
    		     i++;
    		     int temp = array[i];
    	         array[i] = array[j];
    	         array[j] = temp;
    	       }
    	  }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return (i + 1);
    }
    static void quickSort(int array[], int low, int high) 
    {
        if (low < high)
         {
           int pi = partition(array, low, high);
           quickSort(array, low, pi - 1);
           quickSort(array, pi + 1, high);
         }
    }
    
  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] data = { 35,50,15,25,80,20,90,45 };
	    System.out.println("Unsorted Array");
	    System.out.println(Arrays.toString(data));

	    int size = data.length;

	    // call quicksort() on array data
	    QuickSort.quickSort(data, 0, size - 1);

	    System.out.println("Sorted Array in Ascending Order ");
	    System.out.println(Arrays.toString(data));
	}

}



















/*static int partition(int array[], int low, int high) {
    
    // choose the rightmost element as pivot
    
    
    // pointer for greater element
   

    // traverse through all elements
    // compare each element with pivot
    

        // if element smaller than pivot is found
        // swap it with the greater element pointed by i
      

        // swapping element at i with element at j
       
      }

    }

    // swapt the pivot element with the greater element specified by i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    // return the position from where partition is done
    return (i + 1);
  }

  static void quickSort(int array[], int low, int high) {
    if (low < high) {

      // find pivot element such that
      // elements smaller than pivot are on the left
      // elements greater than pivot are on the right
      int pi = partition(array, low, high);
      
      // recursive call on the left of pivot
      quickSort(array, low, pi - 1);

      // recursive call on the right of pivot
      quickSort(array, pi + 1, high);
    }
  }
}*/