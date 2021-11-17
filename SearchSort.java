/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taimurshah
 */
public class SearchSort{

    // func to linear Search an array
    public int linearSearch(int[] arr, int key){

        for(int i = 0; i< arr.length ; i++){
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    // Divide and conqure 
    // works only for sorted array
    public int binarySearch(int[] arr,int low, int high, int key){
        
        if(high >= low){

        int middle = low + (high - low) / 2;

        if(arr[middle] == key)
            return middle;

        else if (arr[middle] > key) // search the lower half
            binarySearch(arr, low, middle - 1, key);
        
        else // seach the upper half
            binarySearch(arr, middle + 1, high, key);

        }
        return -1;
    }

    public void bubbleSort(int[] ar){
        int temp;
       for(int i = ar.length - 1; i>=0; i-- ){

            for(int j=1; j<= i; j++){
                if(ar[j-1] > ar[j]){
                    temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j] = temp;
                }
            }
       }
    }


}// class ends

