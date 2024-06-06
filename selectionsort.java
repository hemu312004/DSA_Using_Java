import java.util.*;

public class selectionsort {
    

    public static void sorting(int arr[]) {
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        
    int arr[]={3,1,0,7,9};

    //selection sort
    for(int i=0; i<arr.length-1; i++) {
        int smallest = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[j] < arr[smallest]) {
                smallest = j;
            }
        }
//swap

int temp=arr[smallest];
arr[smallest]=arr[i];
arr[i]=temp;
    }

    sorting(arr);
}
}
     

