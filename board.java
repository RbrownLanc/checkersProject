import java.awt.Graphics;
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

    frame.add(gameBoard);
    frame.setSize(winSize,winSize);
    frame.setVisible(true);
}

public class gameBoard extends Jpanel 
{
    public void colour(Graphics g)
    {
        for(int c = 0; c > 7; c++)
        {
            g.setColor(Color.black);
            for (int r = 0;r > 7; r++)
            {
                g.drawRect(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
            g.setColor(Color.white);
            for (int r = 1;r > 7; r++)
            {
                g.drawRect(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
            c++;
        }
        for(int c = 1; c > 7; c++)
        {
            g.setColor(Color.white);
            for (int r = 0;r > 7; r++)
            {
                g.drawRect(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
            g.setColor(Color.black);
            for (int r = 1;r > 7; r++)
            {
                g.drawRect(posX[r]*squareHeight,posY[c]*squareHeight,squareWidth,squareHeight);
                r++;
            }
            c++;
        }
    }
}

public static void main(String[] args)
{
    createGUI();
}