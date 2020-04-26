package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BoardTest.class, ChessPieceTest.class, KingTest.class, KnightTest.class, PawnTest.class })
public class JunitTestSuite {

}
