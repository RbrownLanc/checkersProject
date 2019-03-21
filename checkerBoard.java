import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class checkerBoard extends Frame 
{
    private int numberOfSquares = 8;
    private int squareHeight = 100;
    private int squareWidth = squareHeight;

    private int winSize = numberOfSquares * squareHeight;

    private int posX[] = {0,1,2,3,4,5,6,7};
    private int posY[] = {0,1,2,3,4,5,6,7};

    private int column;

    private int locationX;
    private int locationY;
    private int loc;

    //0 = selected , 1 = white, 2 = red, 3 = black
    private int contained;

    private int allLocations[] = 
    {
        3,2,3,2,3,2,3,2,
        2,3,2,3,2,3,2,3,
        3,2,3,2,3,2,3,2,
        0,3,0,3,0,3,0,3,
        3,0,3,0,3,0,3,0,
        1,3,1,3,1,3,1,3,
        3,1,3,1,3,1,3,1,
        1,3,1,3,1,3,1,3,
    };
    private int move1;
    private int move2;
    private int move3;
    private int move4;
    
    private int FromX;
    private int FromY;

    private int blankX;
    private int blankY;

    public static void main(String[] args)
    {
        checkerBoard GUI = new checkerBoard ();
        GUI.createGUI();
    }

    public void createGUI()
    {
        JFrame frame = new JFrame("Checkers");

        JPanel gameBoard = new JPanel();
        gameBoard.setLayout(null);

        ImageIcon white = new ImageIcon("empty.png");
        ImageIcon Black = new ImageIcon("empty2.png");

        frame.add(gameBoard);
        gameBoard.setBackground(Color.black);
        gameBoard.setSize(winSize,winSize);
        frame.setSize(winSize,winSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);




//white checkers
        JButton whiteChecker1 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker2 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker3 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker4 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker5 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker6 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker7 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker8 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker9 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker10 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker11 = new JButton(new ImageIcon("white.png"));
        JButton whiteChecker12 = new JButton(new ImageIcon("white.png"));

        gameBoard.add(whiteChecker1);
        gameBoard.add(whiteChecker2);
        gameBoard.add(whiteChecker3);
        gameBoard.add(whiteChecker4);
        gameBoard.add(whiteChecker5);
        gameBoard.add(whiteChecker6);
        gameBoard.add(whiteChecker7);
        gameBoard.add(whiteChecker8);
        gameBoard.add(whiteChecker9);
        gameBoard.add(whiteChecker10);
        gameBoard.add(whiteChecker11);
        gameBoard.add(whiteChecker12);

        whiteChecker1.setBounds(posX[0]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteChecker2.setBounds(posX[2]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteChecker3.setBounds(posX[4]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteChecker4.setBounds(posX[6]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteChecker5.setBounds(posX[1]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
        whiteChecker6.setBounds(posX[3]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
        whiteChecker7.setBounds(posX[5]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
        whiteChecker8.setBounds(posX[7]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
        whiteChecker9.setBounds(posX[0]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
        whiteChecker10.setBounds(posX[2]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
        whiteChecker11.setBounds(posX[4]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
        whiteChecker12.setBounds(posX[6]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
//squares        
        JButton whiteSquare1 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare2 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare3 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare4 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare5 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare6 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare7 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare8 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare9 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare10 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare11 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare12 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare13 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare14 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare15 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare16 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare17 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare18 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare19 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare20 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare21 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare22 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare23 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare24 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare25 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare26 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare27 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare28 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare29 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare30 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare31 = new JButton(new ImageIcon("empty.png"));
        JButton whiteSquare32 = new JButton(new ImageIcon("empty.png"));

        gameBoard.add(whiteSquare1);
        gameBoard.add(whiteSquare2);
        gameBoard.add(whiteSquare3);
        gameBoard.add(whiteSquare4);
        gameBoard.add(whiteSquare5);
        gameBoard.add(whiteSquare6);
        gameBoard.add(whiteSquare7);
        gameBoard.add(whiteSquare8);
        gameBoard.add(whiteSquare9);
        gameBoard.add(whiteSquare10);
        gameBoard.add(whiteSquare11);
        gameBoard.add(whiteSquare12);
        gameBoard.add(whiteSquare13);
        gameBoard.add(whiteSquare14);
        gameBoard.add(whiteSquare15);
        gameBoard.add(whiteSquare16);
        gameBoard.add(whiteSquare17);
        gameBoard.add(whiteSquare18);
        gameBoard.add(whiteSquare19);
        gameBoard.add(whiteSquare20);
        gameBoard.add(whiteSquare21);
        gameBoard.add(whiteSquare22);
        gameBoard.add(whiteSquare23);
        gameBoard.add(whiteSquare24);
        gameBoard.add(whiteSquare25);
        gameBoard.add(whiteSquare26);
        gameBoard.add(whiteSquare27);
        gameBoard.add(whiteSquare28);
        gameBoard.add(whiteSquare29);
        gameBoard.add(whiteSquare30);
        gameBoard.add(whiteSquare31);
        gameBoard.add(whiteSquare32);

        whiteSquare1.setBounds(posX[0]*squareHeight,posY[1]*squareHeight,squareWidth,squareHeight);
        whiteSquare2.setBounds(posX[0]*squareHeight,posY[3]*squareHeight,squareWidth,squareHeight);
        whiteSquare3.setBounds(posX[0]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteSquare4.setBounds(posX[0]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
        whiteSquare5.setBounds(posX[1]*squareHeight,posY[0]*squareHeight,squareWidth,squareHeight);
        whiteSquare6.setBounds(posX[1]*squareHeight,posY[2]*squareHeight,squareWidth,squareHeight);
        whiteSquare7.setBounds(posX[1]*squareHeight,posY[4]*squareHeight,squareWidth,squareHeight);
        whiteSquare8.setBounds(posX[1]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
        whiteSquare9.setBounds(posX[2]*squareHeight,posY[1]*squareHeight,squareWidth,squareHeight);
        whiteSquare10.setBounds(posX[2]*squareHeight,posY[3]*squareHeight,squareWidth,squareHeight);
        whiteSquare11.setBounds(posX[2]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteSquare12.setBounds(posX[2]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
        whiteSquare13.setBounds(posX[3]*squareHeight,posY[0]*squareHeight,squareWidth,squareHeight);
        whiteSquare14.setBounds(posX[3]*squareHeight,posY[2]*squareHeight,squareWidth,squareHeight);
        whiteSquare15.setBounds(posX[3]*squareHeight,posY[4]*squareHeight,squareWidth,squareHeight);
        whiteSquare16.setBounds(posX[3]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
        whiteSquare17.setBounds(posX[4]*squareHeight,posY[1]*squareHeight,squareWidth,squareHeight);
        whiteSquare18.setBounds(posX[4]*squareHeight,posY[3]*squareHeight,squareWidth,squareHeight);
        whiteSquare19.setBounds(posX[4]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteSquare20.setBounds(posX[4]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
        whiteSquare21.setBounds(posX[5]*squareHeight,posY[0]*squareHeight,squareWidth,squareHeight);
        whiteSquare22.setBounds(posX[5]*squareHeight,posY[2]*squareHeight,squareWidth,squareHeight);
        whiteSquare23.setBounds(posX[5]*squareHeight,posY[4]*squareHeight,squareWidth,squareHeight);
        whiteSquare24.setBounds(posX[5]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
        whiteSquare25.setBounds(posX[6]*squareHeight,posY[1]*squareHeight,squareWidth,squareHeight);
        whiteSquare26.setBounds(posX[6]*squareHeight,posY[3]*squareHeight,squareWidth,squareHeight);
        whiteSquare27.setBounds(posX[6]*squareHeight,posY[5]*squareHeight,squareWidth,squareHeight);
        whiteSquare28.setBounds(posX[6]*squareHeight,posY[7]*squareHeight,squareWidth,squareHeight);
        whiteSquare29.setBounds(posX[7]*squareHeight,posY[0]*squareHeight,squareWidth,squareHeight);
        whiteSquare30.setBounds(posX[7]*squareHeight,posY[2]*squareHeight,squareWidth,squareHeight);
        whiteSquare31.setBounds(posX[7]*squareHeight,posY[4]*squareHeight,squareWidth,squareHeight);
        whiteSquare32.setBounds(posX[7]*squareHeight,posY[6]*squareHeight,squareWidth,squareHeight);
    }
}