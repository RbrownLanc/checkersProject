class checker();
{
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
}