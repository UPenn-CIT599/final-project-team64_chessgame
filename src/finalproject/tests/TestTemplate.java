package finalproject.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestTemplate {

    @Test
    public void testFor3conditions() {
        // Set up for the test, manipulating local variables
        Object condition1 = null;
        assertTrue1(condition1);
        Object condition2 = null;
        assertTrue1(condition2);
        Object condition3 = null;
        assertTrue1(condition3);
    }

    private void assertTrue1(Object condition1) {
        // TODO Auto-generated method stub
    }
    
    private void assertTrue2(Object condition2) {
        // TODO Auto-generated method stub
    }
    
    private void assertTrue3(Object condition3) {
        // TODO Auto-generated method stub
    }

    // Local variables become instance variables
    @Before
    public void setUpSomething() {
        // Set up for the test, manipulating instance variables
    }

    @Test
    public void testFor1condition_Condition4() {
        boolean condition4 = false;
        assertTrue1(condition4);
    }

    @Test
    public void testFor1condition_Condition5() {
        boolean condition5 = false;
        assertTrue1(condition5);
    }

    @Test
    public void testFor1condition_Condition6() {
        boolean condition6 = false;
        assertTrue1(condition6);
    }

    @After
    public void deleteSetUp() {
        Object setUp;
        setUp.delete();
    }

}
