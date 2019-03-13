///////    TicUnGame.java    ///////

/** Adds unMove to TicGame */

public class TicUnGame extends TicGame
{               
    public TicUnGame(TicBoard b)
    {   super(b);
        moveSeq = new int[9];
    }

    protected TicUnGame() { } 

    public int move(int m, boolean player)
    {   int status = super.move(m, player);
        if ( status != NOMOVE )
        {   moveSeq[moveCount-1] = m;  
            lastPlayer = player;
        }
        return status;
    }
// Retruns true if unmoved successfully
    public boolean unMove()
    {   if ( moveCount > 0 && ! ended() )
        {  int m = moveSeq[--moveCount];
           if ( lastPlayer == PLAYER_O )
                circle &= ~(1 << m);
           else
                cross &= ~(1 << m);
           lastPlayer = ! lastPlayer;
           return true;
        }
        return false;
    }

    protected int[] moveSeq;
    protected boolean lastPlayer;
}

