
public class recursive_subsequnce {
    

public static void subseq(String str,int idx,String newstring){


    //base case
    if(idx==str.length())
    {
        System.err.print(newstring);
        return;
    }
    char currchar= str.charAt(idx);

    //to be
    subseq( str, idx+1,newstring+currchar); 
//not to be
subseq(str, idx+1, newstring);


}
public static void main(String[] args) {
    String str="abc";
    subseq(str,0 , " "); 

}
}
