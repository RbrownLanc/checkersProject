import java.awt.Graphics;
import java.awt.*;
import javax.swing.*;

public class board extends JFrame
{
    private int numberOfSquares = 8;
    private int squareHeight = 100;
    private int squareWidth = squareHeight;

    private int winSize = squareHeight * numberOfSquares;

    private int posX[] = {0,1,2,3,4,5,6,7};
    private int posY[] = {0,1,2,3,4,5,6,7};

    JButton[] boardbuttons = new JButton[64];

    private int column;
        
    void createGUI()
    {
        JFrame frame = new JFrame("Checkers");

        JPanel gameBoard = new JPanel();
        gameBoard.setLayout(null);

        ImageIcon white = new ImageIcon("empty.png");
        ImageIcon Black = new ImageIcon("empty2.png");
        
        for(int s = 0;s < 64;s++)
        {
            boardbuttons[s].setIcon(white);
            s++;
            boardbuttons[s].setIcon(Black);
        }


        for(int c = 0; c < 7; c++)
        {
            column = c * 8;
            //black, white
            for (int r = 0;r < 7; r++)
            {
                boardbuttons[r+column].setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
            for (int r = 1;r < 7; r++)
            {
                boardbuttons[r+column].setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
            c++;
            column = c * 8;
            //inverse (white, black)
            for (int r = 0;r < 7; r++)
            {
                boardbuttons[r+column].setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
            for (int r = 1;r < 7; r++)
            {
                boardbuttons[r+column].setBounds(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
        }
    }



    void whiteCheckers()
    {
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

    }

    void whiteMovement()
    {
        whiteMovementFunction(whiteChecker1);
        whiteMovementFunction(whiteChecker2);
        whiteMovementFunction(whiteChecker3);
        whiteMovementFunction(whiteChecker4);
        whiteMovementFunction(whiteChecker5);
        whiteMovementFunction(whiteChecker6);
        whiteMovementFunction(whiteChecker7);
        whiteMovementFunction(whiteChecker8);
        whiteMovementFunction(whiteChecker9);
        whiteMovementFunction(whiteChecker10);
        whiteMovementFunction(whiteChecker11);
        whiteMovementFunction(whiteChecker12);

        ImageIcon select = new ImageIcon("selected.png");

        JButton select1 = new JButton(select);
        JButton select2 = new JButton(select);
        JButton select3 = new JButton(select);
        JButton select4 = new JButton(select);
    }

    void whiteMovementFunction(JButton checkerName)
    {
        //clicking the checker
        checkerName.addListener(new ActionListener()
        {
            public void acctionPerformed(ActionEvent e)
            {
                contained = 1;
                int FromX = checkerName.getlocation().x;
                int FromY = checkerName.getlocation().y;

                locationY = FromY/squareHeight;
                locationX = FromX/squareWidth;
                locationY = (locationY - 1) * 8;
                locationX = locationX + 1;
                move1 = locationX + locationY;
                move2 = move1 - 2;
                if (allLocations[move1] != 0 && allLocations[move2] == 0)
                {
                    select2.setBounds(FromX + squareWidth,FromY - squareHeight,squareWidth,squareHeight);
                    gameboard.add(select2);
                }
                else if(allLocations[move2] != 0 && allLocations[move1] == 0)
                {
                    select1.setBounds(FromX - squareWidth,FromY - squareHeight,squareWidth,squareHeight);
                    gameboard.add(select1);
                }
                else
                {
                    select1.setBounds(FromX - squareWidth,FromY - squareHeight,squareWidth,squareHeight);
                    select2.setBounds(FromX + squareWidth,FromY - squareHeight,squareWidth,squareHeight);
                    gameboard.add(select1);
                    gameboard.add(select2);
                }
            }
        });

        //clicking blank / white space
        select.addListener(new ActionListener()
        {
            public void acctionPerformed(ActionEvent e)
            {
                if (contained > 0)
                {
                int blankX = bwhite.getlocation().x;
                int blankY = bwhite.getlocation().y;

                checkerName.setBounds(blankX,blankY,squareWidth,squareHeight);

                //changes 1 to blank
                locationY = FromY/squareHeight;
                locationX = FromX/squareWidth;
                locationY = locationY  * 8;
                loc = locationX + locationY;
                allLocations[loc] = 0;
                //changes the blank to 1
                locationY = blankY/squareHeight;
                locationX = blankX/squareWidth;
                locationY = locationY  * 8;
                loc = locationX + locationY;
                allLocations[loc] = 1;

                contained = null;
                FromX = null;
                FromY = null;
                }
                else
                { 
                    contained = 0;
                }
            }
        });
    }

    public static void main(String[] args)
    {
        //creates the board
        createGUI();

        checker myclass = new checker();

        //creates the white checkers
        whiteCheckers();

        //moves the white checkers
        WhiteMovement();

        //all frame commands
        frameSetup();
    }

    void frameSetup()
    {
        gameboard.add(whiteChecker1);
        gameboard.add(whiteChecker2);
        gameboard.add(whiteChecker3);
        gameboard.add(whiteChecker4);
        gameboard.add(whiteChecker5);
        gameboard.add(whiteChecker6);
        gameboard.add(whiteChecker7);
        gameboard.add(whiteChecker8);
        gameboard.add(whiteChecker9);
        gameboard.add(whiteChecker10);
        gameboard.add(whiteChecker11);
        gameboard.add(whiteChecker12);
        gameboard.add(bWhite);
        gameboard.add(bBlack);
        frame.add(gameBoard);
        frame.setSize(winSize,winSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}