package enhancedLive2d_test;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Timeinputbox extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void Timeinputbox_frame()
	{
		JFrame boxframe=new JFrame();
		Container layeredPane=boxframe.getLayeredPane();
		
		JLabel backlabel=new JLabel();
		ImageIcon tboxicon=new ImageIcon("texture/tboxBG.png");
		backlabel.setIcon(tboxicon);
		
		JTextField mintxt=new JTextField("0");
		JTextField sectxt=new JTextField("0");
		JTextField msectxt=new JTextField("0");
		
		JLabel labelok=new JLabel();
		ImageIcon tboxokicon=new ImageIcon("texture/tboxok.png");
		ImageIcon tboxokiconPressed=new ImageIcon("texture/tboxokpressed.png");
		labelok.setIcon(tboxokicon);
		labelok.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 labelok.setIcon(tboxokiconPressed);
             }
	         public void mouseExited(MouseEvent e)
	         {
	        	 labelok.setIcon(tboxokicon);
	         }
	         public void mouseClicked(MouseEvent e)
	         {
	        	 TextureVar.tmax=Double.parseDouble(msectxt.getText())+Double.parseDouble(sectxt.getText())*1000+Double.parseDouble(mintxt.getText())*60000;
	        	 if(TextureVar.tmax>=540000)
	        	 {
	        		 TextureVar.tmax=540000;
	        	 }	        		 
	        	 TextureVar.trightdate.setTime((long)TextureVar.tmax);
	        	 TextureVar.formattedtright=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.trightdate);
	        	 TextureVar.timeright.setText(TextureVar.formattedtright);
	        	 boxframe.dispose();
	         }
       });
	   
	   layeredPane.add(backlabel, new Integer(1));
	   backlabel.setBounds(0,0,400,100);
	   layeredPane.add(mintxt, new Integer(2));
	   mintxt.setBounds(20,52,70,30);
	   layeredPane.add(sectxt, new Integer(2));
	   sectxt.setBounds(100,52,70,30);
	   layeredPane.add(msectxt, new Integer(2));
	   msectxt.setBounds(180,52,70,30);
	   layeredPane.add(labelok, new Integer(2));
	   labelok.setBounds(310,52,70,30);
	   
	   boxframe.setSize(400,100); //base container size
	   boxframe.setResizable(false); //game window cannot change size
	   Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// get resolution
	   boxframe.setLocation(screenSize.width/2-200,screenSize.height/2-50);// determine the base container's position on the screen
	   boxframe.setUndecorated(true);
	   boxframe.setVisible(true);
	}
}
