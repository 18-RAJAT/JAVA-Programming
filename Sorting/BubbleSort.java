package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int array[])
    {
        int size = array.length;

        for(int i=0;i<size-1;++i)

           for(int j=0;j<size-i-1;++j)
               
               if(array[j] > array[j+1])
               {
                   int temp = array[j];
                   array[j] =array[j+1];
                   array[j+1] = temp;
               }
    }
    
    public static void main(String args[])
    {
     int[] arr = {-2,11,22,55,33,56,1};

        BubbleSort.bubbleSort(arr);
     
     System.out.println("Sorted array in accending order");
     System.out.println(Arrays.toString(arr));
    }
}
