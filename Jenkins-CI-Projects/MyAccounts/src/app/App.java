package app;

/**
 *  This is App Code
 *
 */
public class App 
{
    private static int unUsed = 101;

    public static void main( String[] args )
    {
        if(true)
         {
          System.out.println( "Hello World!" );
          System.out.println( "Hello World From Decos!" );
          System.out.println( "Hello World From Decos!" );
          System.out.println( "The number is : "+unUsed );
}
        else
       System.out.println( "No Message Here Now!" );
            while(true)
            {
               if(true)
                 break;
              }
            for(int i =0;i < 10; i++)
  System.out.println( "\nfor Message!\n" );
           
    }

   public void runEmptyTry()
 {
  try{
   
    }
   catch(Exception e){System.out.println( "The exception caught is  "+e.getMessage() );}
  

 }

   public void run()
{

  System.out.println( "Hello World!" );
   int data = 100;
  String name = "KishorKumar";
   int datya = 1000;
  

}
   public void processData()
    {
      System.out.println( "processData in App..." );

    }

 private void mySecret()
   {
     System.out.println("mySecret()in App..." );
  }

  public String runMe(String name)
   {
     name = "user";
     name = new String("UserDetails");
     return new String("App data");
  }
  
}
