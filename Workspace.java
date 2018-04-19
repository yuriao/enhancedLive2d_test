package enhancedLive2d_test;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.SwingConstants;

public class Workspace {
	
	public Workspace()
	{
		Point origin = new Point();
		Color labelcolor = new Color(51, 51, 51);
		
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
		TextureVar.layeredPane.add(TextureVar.timecontroller,new Integer(4));//add the "New Game" button to the base container
		TextureVar.timecontroller.setBounds(107,523,30,30);// button size
		TextureVar.timecontroller.setIcon(TextureVar.icontimecontroller);
		
		TextureVar.timecontroller.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mousePressed(MouseEvent e)
	         {
	             origin.x = e.getX(); 
	             origin.y = e.getY();
	         }
        });
		
		TextureVar.timecontroller.addMouseMotionListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mouseDragged(MouseEvent e)
	         {
	             Point p = TextureVar.timecontroller.getLocation();
	             if(p.x + (e.getX() - origin.x)<=683&&p.x + (e.getX() - origin.x)>=107)
	             {
	                 TextureVar.timecontroller.setLocation(p.x + (e.getX() - origin.x), 523);
	                 TextureVar.t=TextureVar.tmax*(p.x + (e.getX() - origin.x)-107)/576;
	                 TextureVar.tleftdate.setTime((long)(TextureVar.tmin+TextureVar.t));
	                 TextureVar.trightdate.setTime((long)(TextureVar.tmax-TextureVar.t));
	                 TextureVar.formattedtleft=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.tleftdate);
	                 TextureVar.formattedtright=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.trightdate);
	                 TextureVar.timeleft.setText(TextureVar.formattedtleft);
	                 TextureVar.timeright.setText(TextureVar.formattedtright);
	             }
	         }
        });
		
		TextureVar.layeredPane.add(TextureVar.timeleft,new Integer(4));
		TextureVar.timeleft.setBounds(20,495,85,85);
		TextureVar.timeleft.setOpaque(true);
		TextureVar.timeleft.setBackground(labelcolor);
		TextureVar.timeleft.setForeground(Color.WHITE);
		TextureVar.timeleft.setText("00:00.000");
		TextureVar.timeleft.setHorizontalAlignment(SwingConstants.CENTER);
		
		TextureVar.layeredPane.add(TextureVar.timeright,new Integer(4));
		TextureVar.timeright.setBounds(715,495,85,85);
		TextureVar.timeright.setOpaque(true);
		TextureVar.timeright.setBackground(labelcolor);
		TextureVar.timeright.setForeground(Color.WHITE);
		TextureVar.timeright.setText("00:00.000");
		TextureVar.timeright.setHorizontalAlignment(SwingConstants.CENTER);
		
		TextureVar.timeright.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
	         public void mouseClicked(MouseEvent e)
	         {
                  TextureVar.tbox.Timeinputbox_frame();
	         }
        });
		
		TextureVar.layeredPane.add(TextureVar.forward,new Integer(4));
		TextureVar.forward.setBounds(450,555,30,15);
		TextureVar.forward.setIcon(TextureVar.iconforward);
		
		TextureVar.layeredPane.add(TextureVar.backward,new Integer(4));
		TextureVar.backward.setBounds(320,555,30,15);
		TextureVar.backward.setIcon(TextureVar.iconbackward);
		
		TextureVar.forward.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
			 public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.forward.setIcon(TextureVar.iconforwardPressed);
             }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.forward.setIcon(TextureVar.iconforward);
	         }
	         public void mouseClicked(MouseEvent e)
	         {
	        	 Point p = TextureVar.timecontroller.getLocation();
	             if(p.x <683&&p.x >=107)
	             {
	                 TextureVar.timecontroller.setLocation(p.x + 1, 523);
	                 TextureVar.t=TextureVar.t+TextureVar.tmax/576;
	                 TextureVar.tleftdate.setTime((long)(TextureVar.tmin+TextureVar.t));
	                 TextureVar.trightdate.setTime((long)(TextureVar.tmax-TextureVar.t));
	                 TextureVar.formattedtleft=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.tleftdate);
	                 TextureVar.formattedtright=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.trightdate);
	                 TextureVar.timeleft.setText(TextureVar.formattedtleft);
	                 TextureVar.timeright.setText(TextureVar.formattedtright);
	             }
	         }
/*	         public void mousePressed(MouseEvent e)
	         {
	        	 
	             if(p.x <683&&p.x >=107)
	             {
	            	 Point p = TextureVar.timecontroller.getLocation();
	                 TextureVar.timecontroller.setLocation(p.x + 1, 523);
	                 TextureVar.t=TextureVar.t+TextureVar.tmax/576;
	                 TextureVar.tleftdate.setTime((long)(TextureVar.tmin+TextureVar.t));
	                 TextureVar.trightdate.setTime((long)(TextureVar.tmax-TextureVar.t));
	                 TextureVar.formattedtleft=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.tleftdate);
	                 TextureVar.formattedtright=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.trightdate);
	                 TextureVar.timeleft.setText(TextureVar.formattedtleft);
	                 TextureVar.timeright.setText(TextureVar.formattedtright);
	             }
	         }*/
        });		
		
		TextureVar.backward.addMouseListener(new MouseAdapter() {// action of the "Load" button depending on the mouse movement
			 public void mouseEntered(MouseEvent e) {  
	        	 TextureVar.backward.setIcon(TextureVar.iconbackwardPressed);
            }
	         public void mouseExited(MouseEvent e)
	         {
	        	 TextureVar.backward.setIcon(TextureVar.iconbackward);
	         }
	         public void mouseClicked(MouseEvent e)
	         {
	        	 Point p = TextureVar.timecontroller.getLocation();
	             if(p.x <=683&&p.x >107)
	             {
	                 TextureVar.timecontroller.setLocation(p.x - 1, 523);
	                 TextureVar.t=TextureVar.t-TextureVar.tmax/576;
	                 TextureVar.tleftdate.setTime((long)(TextureVar.tmin+TextureVar.t));
	                 TextureVar.trightdate.setTime((long)(TextureVar.tmax-TextureVar.t));
	                 TextureVar.formattedtleft=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.tleftdate);
	                 TextureVar.formattedtright=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.trightdate);
	                 TextureVar.timeleft.setText(TextureVar.formattedtleft);
	                 TextureVar.timeright.setText(TextureVar.formattedtright);
	             }
	         }
/*	         public void mousePressed(MouseEvent e)
	         {
	        	 Point p = TextureVar.timecontroller.getLocation();
	             if(p.x <=683&&p.x >107)
	             {
	                 TextureVar.timecontroller.setLocation(p.x - 1, 523);
	                 TextureVar.t=TextureVar.t-TextureVar.tmax/576;
	                 TextureVar.tleftdate.setTime((long)(TextureVar.tmin+TextureVar.t));
	                 TextureVar.trightdate.setTime((long)(TextureVar.tmax-TextureVar.t));
	                 TextureVar.formattedtleft=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.tleftdate);
	                 TextureVar.formattedtright=new SimpleDateFormat("mm:ss.SSS").format(TextureVar.trightdate);
	                 TextureVar.timeleft.setText(TextureVar.formattedtleft);
	                 TextureVar.timeright.setText(TextureVar.formattedtright);
	             }
	         } */
       });		
		
	}
}
