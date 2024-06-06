public class  recursivesum{

    public static void sum(int i,int n,int sum){

    if(i==n)//base
    {
        sum +=i;
        System.out.println(sum);
        return;
    }

    sum+=i;
    sum(i+1,n,sum);
    System.out.println(i);

}

    public static void main(String[] args)
    {
     sum(1,5,0);
     //System.out.println(sum);
    }
}