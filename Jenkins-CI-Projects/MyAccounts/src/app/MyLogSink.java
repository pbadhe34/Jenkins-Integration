
  package app;

  
    	

 public class MyLogSink	 	
 {
 	 	
     
  	 	
     private final int data =100;
 	 	
 
 	 	
     public MyLogSink( )
 	
     {
 	  	
          
  	 	
     }
 	 	
 
  	 	
     public void debug( String message )
 	 	
     {
 	  	
         System.out.println(message);
 	 	
     }
 	 	
 
 	 	
     public void error( String message )
 	 	
     {
  	  	
          System.err.println("Error : "+message); 
 	 	
     }
  	 	
 
 	 	
     public void info( String message )
 	 	
     {
  	 	
          System.out.println("Info : "+message); 
 	 	
     }
 	 	
 
 	 	
     public void severe( String message )
 	 	
     {
 	 	
          System.out.println("Severe : "+message); 
 	 	
     }
 	 	
 
 	 	
     public void warning( String message )
 	 	
     { 	
          System.out.println("Warn : "+message); 
  	 	
     }
 	 	
 
 	 	
 }