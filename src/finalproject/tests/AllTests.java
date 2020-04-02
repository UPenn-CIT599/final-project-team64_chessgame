package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({BishopTest, KingTest, KnightTest, PawnTest, QueenTest, RookTest})
public class AllTests {

}
