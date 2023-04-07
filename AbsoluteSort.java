package Problems;
import java.io.*;
import java.util.*;
public class AbsoluteSort 
{
	static void rearrange(int[] arr, int n, int x)
    {
        TreeMap<Integer, ArrayList<Integer> > m= new TreeMap<>();
 

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(x - arr[i]);
            if (m.containsKey(diff)) {
                ArrayList<Integer> al = m.get(diff);
                al.add(arr[i]);
                m.put(diff, al);
            }
            else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(arr[i]);
                m.put(diff, al);
            }
        }
 
        int index = 0;
        for (Map.Entry entry : m.entrySet()) {
            ArrayList<Integer> al = m.get(entry.getKey());
            for (int i = 0; i < al.size(); i++)
                arr[index++] = al.get(i);
        }
    }
 
    
    static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = { 10, 5, 3, 9, 2 };
        int n = arr.length;
        int x = 7;
 
        // Function call
        rearrange(arr, n, x);
        printArray(arr, n);
	}

}

//Output:5 9 10 3 2 
