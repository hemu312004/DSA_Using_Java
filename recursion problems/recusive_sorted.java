
public class recusive_sorted {
    public static boolean checkIfIncreasing(int arr[], int idx) {

if(idx==arr.length-1)
{
    return true;
}

        if (arr[idx]< arr[idx+1]) {
            //array is sorted till now

         return   checkIfIncreasing(arr, idx+1);
        }
        else
        {
            return false;
        }

    }
    public static void main(String[] args)
{

    int arr[]={1,3,2};
    System.out.println(checkIfIncreasing(arr, 0));
    
}


            }
        