package tests;

public class TestTemplate {

    @Test
    public void testFor3conditions() {
        // Set up for the test, manipulating local variables
        assertTrue(condition1);
        assertTrue(condition2);
        assertTrue(condition3);
    }

    
    
    // Local variables become instance variables
    @Before
    public void setUpSomething() {
        // Set up for the test, manipulating instance variables
    }

    @Test
    public void testFor1condition_Condition4() {
        assertTrue(condition4);
    }

    @Test
    public void testFor1condition_Condition5() {
        assertTrue(condition5);
    }

    @Test
    public void testFor1condition_Condition6() {
        assertTrue(condition6);
    }

    @After
    public void deleteSetUp() {
        setUp.delete();
    }

}
