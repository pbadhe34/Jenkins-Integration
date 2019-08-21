 package app;
   	
 import java.io.File;
 	 	
 import java.util.Set;
 	 	
   	
 public interface SourceMap
 {
 	 	
     Set getTargetFiles( File targetDir, String source )throws InclusionException;
 	 	
 }
 