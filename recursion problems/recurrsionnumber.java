public class recurrsionnumber{

    //function 
public static void number(int n) {
    //if(n == 0) 
    if(n==6)
    {
    return;
    }
    System.out.println(n);
    //number(n-1);
    number(n+1);
    }

    public static void main(String[] args) {
        //int n=5;
        int n=1;
        number(n);
    }
}