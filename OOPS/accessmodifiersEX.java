class Account {
   public String name;
   protected String email;
   private String password;


   public void setPassword(String password) {
       this.password = password;
       
   }
   // Method to get the password (for demonstration)
   public String getPassword() {
    return password;
}

}
public class accessmodifiersEX {
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "College";
       a1.setPassword("abcd");
       a1.email = "hello@college.com";
          System.out.println("Name: " + a1.name);
        System.out.println("Password: " + a1.getPassword()); // Using getter for password


   }
}

