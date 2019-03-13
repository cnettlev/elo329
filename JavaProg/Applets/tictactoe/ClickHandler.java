///////    ClickHandler.java    ///////
import java.awt.event.*;

public class ClickHandler extends MouseAdapter
{   ClickHandler(TicTacToe ap)
    {  app = ap;  }

    public void mouseClicked(MouseEvent evt)
    {   app.userMove(evt.getX(), evt.getY());
    }

    private TicTacToe app=null;
}
