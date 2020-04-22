package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    PawnTest.class})

    /** This class remains empty, it is a SuiteClass,
    its annotations specify the classes to be run 
    when a class annotated with @RunWith(Suite.class) is run.*/
    public class JunitTestSuite {

    }
