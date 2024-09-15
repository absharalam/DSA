package com.dsa.binarysearch;
// Find a number using binary search from sorted array, if not matched return -1
public class BinarySearch {

    int binarySearch(int[] arr, int target){
        int start = 0, end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) return mid;

            if(arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] arr = {2, 3, 4, 10, 40};
        int target = 100;
        int result = binarySearch.binarySearch(arr, target);
        if (result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}

/* Algorithm or Pseudocode
* 1) Initialize 2 pointers, start = 1 and end = length of array - 1
* 2) While start <= end
        * Find middle index, mid = start + (end - start) / 2
        * If target equals to middle element, then return the index
        * If target element is less than middle element then update end = mid - 1.
        * If target element is greater than middle element then update start = mid + 1.
* 3) If target element not found till last then return -1
* */