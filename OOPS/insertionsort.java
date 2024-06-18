import java.util.*;


class insertionsort {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 0};

//O(n^2)=TC 

//sorting
       for(int i=0; i<arr.length; i++) {   

        int current=arr[i];
        int j=i-1;
        //j is used to track the sorted part
        while( j>=0 &&current<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }

           //placement
    arr[j+1]=current;
               }
               printArray(arr);

           }
           
       }



