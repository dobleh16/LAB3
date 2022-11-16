/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;

/**
 *
 * @author heynnerherrera
 */
public class HeapSort {
     public void sort(int arr[])
    {
        int n = arr.length;
  
        
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
  
        
        for (int i=n-1; i>=0; i--)
        {
            
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
  
            
            heapify(arr, i, 0);
        }
    }
  
   
    void heapify(int arr[], int n, int i)
    {
        int largest = i;  
        int l = 2*i + 1;  
        int r = 2*i + 2;  
  
        
        if (l < n && arr[l] > arr[largest])
            largest = l;
  
        
        if (r < n && arr[r] > arr[largest])
            largest = r;
  
        
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
  
           
            heapify(arr, n, largest);
        }
    }
  
   
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
  
    
   
    ///GeeksforGeeks, “Java program for Heap Sort,” GeeksforGeeks, 27-Mar-2019. [Online]. Available: https://www.geeksforgeeks.org/java-program-for-heap-sort/#:~:text=Heap%20sort%20is%20a%20comparison,same%20process%20for%20remaining%20element. [Accessed: 10-Nov-2022].
}
