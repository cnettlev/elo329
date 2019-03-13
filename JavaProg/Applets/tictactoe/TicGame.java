///////    TicGame.java    ///////
import java.applet.Applet;
import java.awt.Graphics;

// The nine squares are identified as
//           0   1   2
//           3   4   5
//           6   7   8
// A move is an integer between 0 and 8
// A move made is recorded as a bit in 
// circle for O or cross for X

public class TicGame
{
    public TicGame(TicBoard b)
    { reset(); board = b;} 

    protected TicGame() { }

    public void reset()
    {   moveCount = circle = cross = 0;
        end = false;
    } 

    public boolean ended() { return(end); }

    public void draw(Graphics g, Applet ap)
    {   board.drawBoard(g);
        int mv = moveCount;
        int o = circle, x = cross;
        int i = 0;
        while ( mv > 0 )
        {   if ( (o & 1) != 0 )
            {   board.drawPiece(g, ap, PLAYER_O, i);
                mv--;
            }
            else if ( (x & 1) != 0 )
            {   board.drawPiece(g, ap, PLAYER_X, i);
                mv--;
            }
            i++; o >>= 1; x >>= 1;
        }
    }

    public int move(int m, boolean player)  // make a move for X or O
    {   if ( (m < 0) || (m > 8)  // no such square
             || end ||           // game ended
             (((cross | circle) & (1 << m)) != 0) //square taken
           )
           return NOMOVE;
        moveCount++;
        if ( player == PLAYER_X ) cross |= 1 << m;
        else circle |= 1 << m;
        return (status());
    }

// for subclassing
    public boolean unMove() { return false; } 

// generate a move for indicated player
//    Find a wining move. If no such move
//    take any wining move away from opponent.
//    If neither, make any valid move
    public int genMove(boolean player)
    { int amove = NOMOVE, self, opponent;
      if ( end ) return NOMOVE;
      if ( (cross|circle) == 0 )  // openning move
         return((int)(Math.random()*9));
      if (player == PLAYER_X) 
      {  self = cross; opponent = circle; }
      else
      {  self = circle; opponent = cross; }
      for (int i = 0 ; i < 9 ; i++)
      {  int m = moves[i], mv = (1 << m);
         if ( ((self|opponent) & mv) == 0)       // open square
         {  if (isWin(self | mv)) return m;      // self wins
            if (isWin(opponent | mv)) amove = m; // block opponent win
            else if (amove == NOMOVE) amove = m;
         }
      }
      return amove;  // move found
    }

// Returns game status 
    public int status()
    {   if ( moveCount < 5 ) return PLAY;
        if ( isWin(circle) ) 
        {   end = true; return WIN_O; }
        if ( isWin(cross) )
        {   end = true; return WIN_X; }
        if (moveCount >= 9)
        {   end = true; return TIE; }
        return PLAY;
    }

// Check against all 8 winning bit patterns
    public static boolean isWin(int pos)
    {   for (int i=0; i < 8; i++)
          if ( (pos & win[i]) == win[i] )
              return true;
        return false;
    }

    public static final int NOMOVE = -1;
    public static final int PLAY = 0;
    public static final int WIN_O = 1;
    public static final int WIN_X = 2;
    public static final int TIE = 3;
    public static final boolean PLAYER_X = true;
    public static final boolean PLAYER_O = false;

    protected TicBoard board;
    protected int circle, cross;    // curent position for O and X
    protected int moveCount = 0;    // total number of moves made
    private boolean end;            // end of game flag
// The squares in order of importance...
    protected static int[] moves = {4, 0, 2, 6, 8, 1, 3, 5, 7};
// The winning bit pattern
    static int win[] =  // 8 wining position
    {    (1 << 0) | (1 << 1) | (1 << 2),
         (1 << 3) | (1 << 4) | (1 << 5),
         (1 << 6) | (1 << 7) | (1 << 8),
         (1 << 0) | (1 << 3) | (1 << 6),
         (1 << 1) | (1 << 4) | (1 << 7),
         (1 << 2) | (1 << 5) | (1 << 8),
         (1 << 0) | (1 << 4) | (1 << 8),
         (1 << 2) | (1 << 4) | (1 << 6)
    };
}
