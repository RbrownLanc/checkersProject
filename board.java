import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

public class board
{
    private int numberOfSquares = 8;
    private int squareHeight = 50;
    private int squareWidth = squareHeight;

    private int winSize = squareHeight * numberOfSquares;

    private int posX[] = {1,2,3,4,5,6,7,8};
    private int posY[] = {1,2,3,4,5,6,7,8};
}
private static void createGUI()
{
    JFrame frame = new JFrame("Checkers");

    Jpanel gameBoard = new Jpanel("board");
    Jpanel checkerBoard = new Jpanel("checkerBoard");

    ImageIcon white = new ImageIcon("white.jpg");
    ImageIcon Black = new ImageIcon("black.jpg");

    for(int s = 1; s > 64; s++)
    {
        Jbutton bWhite = new Jbutton(white);
        s++;
        Jbutton bBlack = new Jbutton(black);
    }

    for(int c = 0; c < 7; c++)
    {
        for (int r = 0;r < 7; r++)
        {
            bBlack.setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
            r++;
        }
        for (int r = 1;r < 7; r++)
        {
            bWhite.setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
            r++;
        }
         c++;
    }
    for(int c = 1; c < 7; c++)
    {
        for (int r = 0;r < 7; r++)
        {
            bWhite.setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
            r++;
        }
        for (int r = 1;r < 7; r++)
        {
            bBlack.setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
            r++;
        }
        c++;
    }
}

public class checker();
{
    private int locationX;
    private int locationY;

    //0 = none, 1 = white, 2 = red, 3 = black square 
    private int contained[] = {0,1,2,3};
}

private static void whiteCheckers()
{
    ImageIcon whitePlayer = new ImageIcon("whiteChecker.png");

    for(int p = 0;p < 12; p++)
    {
        Jbutton whiteChecker = new Jbutton(WhitePlayer);
    }

    for(int c = 5; c < 7; c++)
    {
        for (int r = 0;r < 7; r++)
        {
            whiteChecker.setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
            r++;
        }
        c++;
    }
    for(int c = 6; c < 7; c++)
    {
        for (int r = 1;r < 7; r++)
        {
            whiteChecker.setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
            r++;
        }
        c++;
    }
}

public static void main(String[] args)
{
    board class = new board();

    createGUI();

    checker class = new checker();

    whiteCheckers();

    frameSetup();
}

public static void frameSetup()
{
    gameboard.add(whiteChecker);
    gameboard.add(bWhite);
    gameboard.add(bBlack);
    frame.add(gameBoard);
    frame.setSize(winSize,winSize);
    frame.setVisible(true);
}