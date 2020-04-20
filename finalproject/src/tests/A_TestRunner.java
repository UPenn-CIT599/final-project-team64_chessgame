package finalproject.tests;

    import org.junit.runner.JUnitCore;
    import org.junit.runner.Result;
    import org.junit.runner.notification.Failure;

import finalproject.nonGUIversion.JunitTestSuite;


/** 
 * This class launches the tests in the test suite
 */
public class A_TestRunner {
        
 /** 
 * This method initiates the junit testing methods
 */
    public static void main(String[] args) {
           
          Result result = JUnitCore.runClasses(JunitTestSuite.class);

          for (Failure failure : result.getFailures()) {
             System.out.println(failure.toString());
          }
            
          System.out.println(result.wasSuccessful());
       }
    }  
    
