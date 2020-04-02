package finalproject.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    BishopTest.class, 
    KingTest.class, 
    KnightTest.class, 
    PawnTest.class, 
    QueenTest.class, 
    RookTest.class})

    /** The AllTests class remains empty, it is a SuiteClass,
    its annotations specify the classes to be run 
    when a class annotated with @RunWith(Suite.class) is run.*/
    public class JunitTestSuite {

    }
