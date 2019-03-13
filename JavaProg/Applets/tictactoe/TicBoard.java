///////    TicBoard.java    ///////
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class TicBoard
{  public TicBoard(int ax, int ay,
          int w, int h, Image o, Image x)
   {   x0 = ax; y0 = ay; this.x = x; this.o = o;
       width = w; height = h;
       tw = (width-2*lw)/3;
       th = (height-2*lw)/3;
   }

   protected TicBoard() { }  // for class extension

   public void drawBoard(Graphics g)
   {   g.drawLine(tw, y0, tw, height);
       g.drawLine(2*tw+lw, y0, 2*tw+lw, height);
       g.drawLine(x0, th, width, th);
       g.drawLine(x0, 2*th+lw, width, 2*th+lw);
   }

// draw one token for given player in square i
   public void drawPiece(Graphics g, Applet ap,
                         boolean player, int i)
   {   int r= i/3, c = i%3;  // row and column
       g.drawImage( (player==TicGame.PLAYER_X) ? x : o,
               c*(tw+lw)+1, r*(th+lw)+1, tw-1, th-1, ap);
   }

   public int col(int x)
   {  return( (x * 3) / width ); }

   public int row(int y)
   {  return( (y * 3) / height ); }

   protected Image x, o;        // graphical images for pieces
   protected int  x0, y0;       // upper-left corner of board
   protected int width, height; // of board
   protected int tw, th;        // token area width and height
   protected int lw = 1;        // thickness of line

}
