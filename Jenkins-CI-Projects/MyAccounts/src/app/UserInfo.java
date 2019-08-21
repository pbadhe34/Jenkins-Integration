package app;

 
public abstract class UserInfo
{
    private int unUsed = 101;

     

   public void runEmptyTry()
 {
  try{
   
    }
   catch(Exception e){}
    

 }

   public void run()
{

  System.out.println( "Hello World!" );
 int data = 100;
  String name = "Jjj";
  System.out.println("User Info run updated");
  

}
   public void processData()
    {
      System.out.println( "processData in App..." );

    }
public  static void main(String args[])
{
	System.out.println("UserInfo.main()");
	//UserInfo obj = new UserInfo();
	mySecret();
}
 private static void mySecret()
   {
     System.out.println("mySecret()in App..." );
     System.out.println("UserInfo.mySecret()");
  }

  public String runMe(String name)
   {
     name = "user";
     name = new String("UserDetails");
     return new String("App data returned..");
  }
  
}
