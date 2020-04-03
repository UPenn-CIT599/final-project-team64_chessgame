# final-project-team64_chessgame
final-project-team64_chessgame created by GitHub Classroom

Notes for April 06, 2020, Milestone deliverable.

1. We currently have 10 classes planned. Among these classes are several fully developed methods including:

    1.1. Runner class: main method for the class and to run the program

    1.2. Board
        1.2.1. Board()
        1.2.2. initialize()
        1.2.3. isSpaceOccupied(int row, int col)
        1.2.4. placePiece(ChessPiece piece, int row, int column)
        1.2.5. move(ChessPiece piece, int row, int column)
        1.2.6. display();
        1.2.7. checkKingCheckMate();
 
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
        1.4.8. canMove(int row, int column)

2. Each of our classes have an associated test class placed in a JUnit suite with its own runner. Among these tests are several fully developed test methods including:

    2.1. TestRunner.class: main method for the class and to run the junit test suite

    2.2. BoardTest.class:
        2.2.1. setupBeforeClass()
        2.2.2. testBoard()
        2.2.3. testDisplay()
        2.2.4. testPlacePiece()

    2.3. Player.class:
        2.3.1. testPlayer()
