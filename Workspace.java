package enhancedLive2d_test;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Workspace {
	
	public Workspace()
	{
		TextureVar.layeredPane.add(TextureVar.labelWorkBackGround, new Integer(3));
		TextureVar.labelWorkBackGround.setBounds(0,0,1000,600); //background size
		
		TextureVar.layeredPane.add(TextureVar.labelCharacterload,new Integer(4));//add the "New Game" button to the base container
		TextureVar.labelCharacterload.setBounds(850,50,100,50);// button size
		TextureVar.layeredPane.add(TextureVar.labelBGloading,new Integer(4));//add the "New Game" button to the base container
		TextureVar.labelBGloading.setBounds(850,100,100,50);// button size
		TextureVar.layeredPane.add(TextureVar.labelMotionEdition,new Integer(4));//add the "New Game" button to the base container
		TextureVar.labelMotionEdition.setBounds(850,150,100,50);// button size
		TextureVar.layeredPane.add(TextureVar.labelFinishandsave,new Integer(4));//add the "New Game" button to the base container
		TextureVar.labelFinishandsave.setBounds(850,450,100,50);// button size		
		TextureVar.layeredPane.add(TextureVar.labelBack,new Integer(4));//add the "New Game" button to the base container
		TextureVar.labelBack.setBounds(850,500,100,50);// button size
		
		
		TextureVar.labelWorkBackGround.setIcon(TextureVar.iconWorkBG); //content of the background, i.e.the picture
		TextureVar.labelCharacterload.setIcon(TextureVar.iconChload);//content of the button
		TextureVar.labelBGloading.setIcon(TextureVar.iconBGload); //another button, not used for now
		TextureVar.labelMotionEdition.setIcon(TextureVar.iconME);//content of the button
		TextureVar.labelFinishandsave.setIcon(TextureVar.iconFS); //another button, not used for now
		TextureVar.labelBack.setIcon(TextureVar.iconBack);//content of the button
		
		TextureVar.labelCharacterload.addMouseListener(new MouseAdapter() { // action of the "New" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.labelCharacterload.setIcon(TextureVar.iconChloadPressed); //mouse enter, button format change
             }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.labelCharacterload.setIcon(TextureVar.iconChload);//mouse exit, button format return to default
	         }
	         public void mouseClicked(MouseEvent e) //mouse click, start generating game
	         {
	        	
	         }
       });
		
		TextureVar.labelBGloading.addMouseListener(new MouseAdapter() { // action of the "New" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.labelBGloading.setIcon(TextureVar.iconBGloadPressed); //mouse enter, button format change
            }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.labelBGloading.setIcon(TextureVar.iconBGload);//mouse exit, button format return to default
	         }
	         public void mouseClicked(MouseEvent e) //mouse click, start generating game
	         {
	        	
	         }
      });
		
		TextureVar.labelMotionEdition.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.labelMotionEdition.setIcon(TextureVar.iconMEPressed);
             }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.labelMotionEdition.setIcon(TextureVar.iconME);
	         }
	         public void mouseClicked(MouseEvent e)
	         {
	        	 
	         }
       });
	   
		TextureVar.labelFinishandsave.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.labelFinishandsave.setIcon(TextureVar.iconFSPressed);
            }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.labelFinishandsave.setIcon(TextureVar.iconFS);
	         }
	         public void mouseClicked(MouseEvent e)
	         {
	        	 
	         }
      });
		
		TextureVar.labelBack.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.labelBack.setIcon(TextureVar.iconBackPressed);
           }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.labelBack.setIcon(TextureVar.iconBack);
	         }
	         public void mouseClicked(MouseEvent e)
	         {
	        	 TextureVar.layeredPane.removeAll();
	        	 new Welcome();
	         }
     });
		
		//add time controller
	}
}
