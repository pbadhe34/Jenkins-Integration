  package app;
  	 	
 import java.io.*;
  	 	
 public class ArtifactLocation	      
 	 	
  {
 	 	
 
 	 	
     public ArtifactLocation( String fileName)
 	 	
     { 	 
        try{	
         File file = new File(fileName);
 	 	
         file.createNewFile();
      }
  catch(Exception e) {	 	
     }
}
 	 	
 
 	 	
 }