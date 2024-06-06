public class recursive_noofway {


    public static int party(int n){
        if (n == 0) {
            return 1;
        }
    if(n==1)
    {
        return 1;
    }
    
        //single

        int way1= party(n-1);

        //pair

        int way2=(n-1)*party(n-2);
        
        return way1+way2;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(party(n));

    }
    
}
