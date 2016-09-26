import java.awt.*;
import java.awt.font.*;
import java.applet.*;
import java.awt.event.*;

public class event_key_music extends Applet implements KeyListener
{
	String msg;
	Font font = new Font("Arial",Font.BOLD,30);
	AudioClip a;
	char x;
	Image img ;
	public void init()
	{
		addKeyListener(this);
		
	}
	public void start()
	{
		msg = " press P/p for pay & S/s for stop music";
		img = getImage(getCodeBase(),"3.jpeg");
		repaint();
		a = getAudioClip(getCodeBase() ,"1.wav");
	}
	public void keyPressed(KeyEvent k)
	{
	}
	public void keyReleased(KeyEvent k)
	{
		if(x == 'S' || x == 's')
		{
			img = getImage(getCodeBase(),"1.jpg");
			msg = "music pause. press P/p for play";
			repaint();
			a.stop();
		}
		if(x == 'P' || x == 'p')
		{
			img = getImage(getCodeBase(),"2.jpg");
			a.play();
			msg = "your music is playing.  press S/s to stop";
			repaint();
		}
	}
	public void keyTyped(KeyEvent k)
	{
		x = k.getKeyChar();
	}
	public void paint(Graphics g)
	{
		setForeground(Color.green);
		g.drawImage(img,0,0,this);
		
		g.setFont(font);
		g.drawString(msg,50,50);
	}
}
	