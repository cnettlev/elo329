///////    TicTacUn.java    ///////
import java.awt.Graphics;
import java.awt.event.*;
import java.awt.Image;
import java.net.URL;

public class TicTacUn extends TicTacToe
{               
    public void init()
    {   codeBase = getCodeBase();
        setBoard();
        game = new TicUnGame(board);
        addKeyListener(new KeyHandler(this));
        addMouseListener(new ClickHandler(this));
	newGame();
    }

    public boolean unMove()
        {   if ( game.unMove() ) 
            {   game.unMove();  
                repaint();
                return true;
            }
            else
                return false;
        }

    public void doKey(char c)
    {   if ( c == 'U' && unMove() )
            return;
        invalidMove();
    }
}


class KeyHandler extends KeyAdapter
{   KeyHandler(TicTacUn ap)
    {  app = ap;  }

    public void keyTyped(KeyEvent evt)
    {   app.doKey(evt.getKeyChar());
    }

    private TicTacUn app=null;
}
