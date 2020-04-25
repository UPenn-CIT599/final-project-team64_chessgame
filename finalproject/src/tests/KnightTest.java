package tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Test;

import application.Board;
import gamePieces.Knight;

class KnightTest {
    private static Board board;
    private static Knight knight;
    
    @Test
    @Order(5)
    public void testKnightMove() {
    
    }

    
}
