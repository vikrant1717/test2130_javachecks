import java.io.File;
import java.util.HashMap;
import java.util.Map;



public class MyClass {

  public enum COLOR {
    RED, GREEN, BLUE, ORANGE;
  }
  

private static final String MONDAY = "monday";
private static final String TUESDAY = "tuesday";
private static final String WEDNESDAY = "wednesday";

  public boolean getTrue() {
	  return true;
  }
  public boolean getFalse() {
	  return false;
  }
  public void mapMood() {
	    try {
    Map<COLOR, String> moodMap = new HashMap<COLOR, String>();// enummap issue
   // This can never match because $ and ^ have been switched around
    java.util.regex.Pattern.compile("$[a-z]+^"); // Noncompliant;
    
    StringBuffer sb = new StringBuffer();
    sb.append("a");     // avoid this

    StringBuffer sb1 = new StringBuffer();
    sb1.append('a');     // use this instead
  
    
    File tempDir;
    tempDir = File.createTempFile("", ".");
    tempDir.delete();
    tempDir.mkdir();  // Noncompliant
    if(getTrue() | getFalse())
    {
    	
    }
    
    String day = null;
    switch (day) {
    case MONDAY:
    case TUESDAY:
    WEDNESDAY:   // Noncompliant; syntactically correct, but behavior is not what's expected
      ;
      break;
   
  }
    	  /* some work which end up throwing an exception */
    	  throw new IllegalArgumentException();
    	} finally {
    	  /* clean up */
    	  throw new RuntimeException();       // Noncompliant; masks the IllegalArgumentException
    	}
  }
}