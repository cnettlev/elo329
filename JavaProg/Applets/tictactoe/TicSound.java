///////    TicSound.java    ///////

import java.applet.Applet;
import java.applet.AudioClip;

/** Adding sound effects to TicTacToe */

public class TicSound extends TicTacToe
{   public void init()
    {  super.init();
       returnClip=
           getAudioClip(codeBase, "audio/return.au");
       joyClip=
           getAudioClip(codeBase, "audio/joy.au");
       beepClip=
           getAudioClip(codeBase, "audio/beep.au");
    }

    protected void invalidMove() 
    {  if (beepClip != null) beepClip.play(); }
    protected void winner()
    {  if (joyClip != null) joyClip.play(); }
    protected void gameBegin()
    {  if (returnClip != null) returnClip.play(); }

    protected AudioClip returnClip;
    protected AudioClip joyClip;
    protected AudioClip beepClip;
}
