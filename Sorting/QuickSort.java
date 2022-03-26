package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args)
    {
        int [] arr = {5,4,3,2,66,555};
        int high;
        int low;
        sort(arr,low = 0,high = arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] nums,int low,int high)
    {
        if(low >= high)
        {
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;

        int pivot = nums[mid];

        while(start <= end)
        {
            while(nums[start] < pivot)
            {
                start++;
            }

            while(nums[end] > pivot)
            {
                end--;
            }

            if(start <= end)
            {
                //Swapping
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }

        //recursion-call
        sort(nums,low,end);
        sort(nums,start,high);
    }
}
