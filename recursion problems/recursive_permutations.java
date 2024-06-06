public class recursive_permutations {

    public static void permu(String str, String perm)
    {

        if(str.length()==0)
        {
            System.out.println(perm);
        }
        for(int i=0;i<str.length();i++)

        {
            char currchar=str.charAt(i);
            //abc ->ab
            String newString= str.substring(0, i)+str.substring(i+1);
            permu(newString, perm+currchar);
        }
    }
    public static void main(String[] args) {

    String newString="abc";
    permu(newString, "");
        
    }
    
}
