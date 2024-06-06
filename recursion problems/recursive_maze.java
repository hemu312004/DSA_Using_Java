public class recursive_maze {



    public static int maze(int i, int j, int n, int m) {

        if(i==n||j==m){
            return 0;
        }
if(i==n-1&&j==m-1)
{
  return 1;

}

        // move down ward
        int down=maze(i+1, j, n, m);

        //move right
        int right=maze(i, j+1, n, m);

        return down+right;

    }

    public static void main(String[] args) {

        int n= 3, m=3;

        int totpaths=maze(0, 0, n, m);
        System.out.println(totpaths);

        
    }
    
}

