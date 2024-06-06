public class recursive_tiles {


    public static int tile(int n,int m)
    {

        if(n==m)
        {
            return 2;}

            if (n<m) {
                return 1;
                
            }
        //verticle
        int ver=tile(n-m, m);

        //horizontal
        int hor=tile(n-1, m);

        return ver+hor;
    }
    public static void main(String[] args) {
        int n=4, m=2;
        int tot =tile(n, m);
        System.out.println(tot);
    }
    
}
