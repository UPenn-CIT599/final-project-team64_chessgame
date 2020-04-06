# final-project-team64_chessgame
final-project-team64_chessgame created by GitHub Classroom

/** This file is best viewed in "<>Edit file" mode. */

Notes for April 06, 2020, Milestone deliverable.

1. We currently have 10 classes planned. Among these classes are several fully developed methods (that are not constructors or getters or setters) including:

    1.1. Runner class: main method for the class and to run the program

    1.2. Board
        1.2.1. initialize()
        1.2.2. isSpaceOccupied(int row, int col)
        1.2.3. placePiece(ChessPiece piece, int row, int column)
        1.2.4. display();
        1.2.5. checkKingCheckMate();
 
    1.3. Player class:
        1.3.1. isWhiteTeam();
        1.3.2. isBlackTeam();
        1.3.3. Inner Class Player_1 extends Player class
            1.3.3.1. WhiteTeam(boolean whiteTeam) 
        1.3.4. Inner Class Player_2 extends Player class
            1.3.4.1. BlackTeam(boolean blackTeam) 
            
    1.4. ChessPiece class:
        1.4.1. isValidDiagonalMove(int row, int column, int currentRow, int currentColumn)
        1.4.2. isValidHorizontalMove(int row, int column, int currentRow, int currentColumn) 
        1.4.3. isValidVerticalMove(int row, int column, int currentRow, int currentColumn) 
        1.4.4. isValidKingMove(int row, int column, int currentRow, int currentColumn)
        1.4.5. isValidWhitePawnMove(int row, int column, int currentRow, int currentColumn)
        1.4.6. isValidBlackPawnMove(int row, int column, int currentRow, int currentColumn)
        1.4.7. isValidKnightMove(int row, int column, int currentRow, int currentColumn) 
        1.4.8. move(ChessPiece piece, int row, int column)
        1.4.9. canMove(int row, int column)
    
    1.5. Various subclasses that extend the ChessPiece class for specific pieces each with their own specific move methods
        1.5.1 Pawn.java
        1.5.2 Bishop.java
        1.5.3 King.java
        1.5.4 Knight.java
        1.5.5 Queen.java
        1.5.6 Rook.java

2. Each of our classes have an associated test class placed in a JUnit suite with its own runner. Among these tests are several fully developed test methods including:

    2.1. TestRunner.class: main method for the class and to run the junit test suite

    2.2. BoardTest.class:
        2.2.1. setupBeforeClass()
        2.2.2. testDisplay()
        2.2.3. testPlacePiece()

    2.3. Player.class:
        2.3.1. testWhiteTeam()
        2.3.2. testBlackTeam()
