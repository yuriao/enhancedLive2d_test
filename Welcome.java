package enhancedLive2d_test;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Welcome extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L; //serial ID, added automatically
	
	public Welcome(){
		
		
		TextureVar.layeredPane.add(TextureVar.labelBackGround, new Integer(1));
		TextureVar.labelBackGround.setBounds(0,0,1000,600); //background size
		
		TextureVar.layeredPane.add(TextureVar.labelNew,new Integer(2));//add the "New Game" button to the base container
		TextureVar.labelNew.setBounds(700,200,200,100);// button size
		TextureVar.layeredPane.add(TextureVar.labelLoad,new Integer(2));//add the "New Game" button to the base container
		TextureVar.labelLoad.setBounds(700,300,200,100);// button size
		
		TextureVar.labelBackGround.setIcon(TextureVar.iconBackGround); //content of the background, i.e.the picture
		TextureVar.labelNew.setIcon(TextureVar.iconNew);//content of the button
		TextureVar.labelLoad.setIcon(TextureVar.iconLoad); //another button, not used for now
		
		TextureVar.labelNew.addMouseListener(new MouseAdapter() { // action of the "New" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.labelNew.setIcon(TextureVar.iconNewPressed); //mouse enter, button format change
             }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.labelNew.setIcon(TextureVar.iconNew);//mouse exit, button format return to default
	         }
	         public void mouseClicked(MouseEvent e) //mouse click, start generating game
	         {
	        	TextureVar.layeredPane.removeAll();
	        	new Workspace();
	         }
       });
		
		TextureVar.labelLoad.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.labelLoad.setIcon(TextureVar.iconLoadPressed);
             }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.labelLoad.setIcon(TextureVar.iconLoad);
	         }
	         public void mouseClicked(MouseEvent e)
	         {
	        	 TextureVar.layeredPane.removeAll();
	        	 new Workspace();
	         }
       });
		
		
		TextureVar.welcomeframe.setSize(1000,630); //base container size
		TextureVar.welcomeframe.setResizable(false); //game window cannot change size
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();// get resolution
		TextureVar.welcomeframe.setLocation(screenSize.width/2-500,screenSize.height/2-300);// determine the base container's position on the screen
		TextureVar.welcomeframe.setDefaultCloseOperation(EXIT_ON_CLOSE);
		TextureVar.welcomeframe.setVisible(true);
	}
}
