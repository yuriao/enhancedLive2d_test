package enhancedLive2d_test;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextureVar {
	
	public static JFrame welcomeframe=new JFrame(); //base container of all the elements
	public static Container layeredPane=welcomeframe.getLayeredPane();//there are multiple layers in the base container.
	public static int t=0;
	
	//Welcome interface	
	public static JLabel labelBackGround=new JLabel();
	public static ImageIcon iconBackGround=new ImageIcon("texture/background.png");//add image to welcome page background
	public static JLabel labelNew=new JLabel();
	public static JLabel labelLoad=new JLabel();
	public static ImageIcon iconNew=new ImageIcon("texture/new.png");//add image to "new game" button
	public static ImageIcon iconNewPressed=new ImageIcon("texture/newPressed.png");//when pressed, change the image of "new game" button
	public static ImageIcon iconLoad=new ImageIcon("texture/load.png");//add image to "new game" button
	public static ImageIcon iconLoadPressed=new ImageIcon("texture/loadPressed.png");//when pressed, change the image of "new game" button

	//Main Work Space
	public static JLabel labelWorkBackGround=new JLabel();
	public static JLabel labelCharacterload=new JLabel();
	public static JLabel labelBGloading=new JLabel();
	public static JLabel labelMotionEdition=new JLabel();
	public static JLabel labelFinishandsave=new JLabel();
	public static JLabel labelBack=new JLabel();
	public static ImageIcon iconWorkBG=new ImageIcon("texture/WorkBG.png");//add image to "new game" button
	public static ImageIcon iconChload=new ImageIcon("texture/Chload.png");//add image to "new game" button
	public static ImageIcon iconChloadPressed=new ImageIcon("texture/ChloadPressed.png");//when pressed, change the image of "new game" button
	public static ImageIcon iconBGload=new ImageIcon("texture/BGload.png");//add image to "new game" button
	public static ImageIcon iconBGloadPressed=new ImageIcon("texture/BGloadPressed.png");//when pressed, change the image of "new game" button
	public static ImageIcon iconME=new ImageIcon("texture/ME.png");//add image to "new game" button
	public static ImageIcon iconMEPressed=new ImageIcon("texture/MEPressed.png");//when pressed, change the image of "new game" button	
	public static ImageIcon iconFS=new ImageIcon("texture/FS.png");//add image to "new game" button
	public static ImageIcon iconFSPressed=new ImageIcon("texture/FSPressed.png");//when pressed, change the image of "new game" button	
	public static ImageIcon iconBack=new ImageIcon("texture/Back.png");//add image to "new game" button
	public static ImageIcon iconBackPressed=new ImageIcon("texture/BackPressed.png");//when pressed, change the image of "new game" button	
	
	public static JLabel timecontroller=new JLabel();
	public static JLabel timeleft=new JLabel();
	public static JLabel timeright=new JLabel();
	
	
	
	
	
	
	//character loading interface
	public static JLabel labelCharacterBodyf=new JLabel();
	public static JLabel labelCharacterLarmf=new JLabel();
	public static JLabel labelCharacterRarmf=new JLabel();
	public static JLabel labelCharacterLhandf=new JLabel();
	public static JLabel labelCharacterRhandf=new JLabel();
	public static JLabel labelCharacterLlegf=new JLabel();
	public static JLabel labelCharacterRlegf=new JLabel();
	public static JLabel labelCharacterBodys=new JLabel();
	public static JLabel labelCharacterArms=new JLabel();
	public static JLabel labelCharacterHands=new JLabel();
	public static JLabel labelCharacterLegs=new JLabel();
	public static JLabel labelFinish=new JLabel();
	public static JLabel labelLoadFront=new JLabel();
	public static JLabel labelLoadSide=new JLabel();
	public static ImageIcon iconCharacterBodyf=new ImageIcon();
	public static ImageIcon iconCharacterLarmf=new ImageIcon();
	public static ImageIcon iconCharacterRarmf=new ImageIcon();
	public static ImageIcon iconCharacterLhandf=new ImageIcon();
	public static ImageIcon iconCharacterRhandf=new ImageIcon();
	public static ImageIcon iconCharacterLlegf=new ImageIcon();
	public static ImageIcon iconCharacterRlegf=new ImageIcon();
	public static ImageIcon iconCharacterBodys=new ImageIcon();
	public static ImageIcon iconCharacterArms=new ImageIcon();
	public static ImageIcon iconCharacterHands=new ImageIcon();
	public static ImageIcon iconCharacterLegs=new ImageIcon();
	public static ImageIcon iconFinish=new ImageIcon();
	public static ImageIcon iconLoadFront=new ImageIcon();
	public static ImageIcon iconLoadSide=new ImageIcon();
	public static ImageIcon iconFinishPressed=new ImageIcon();
	public static ImageIcon iconLoadFrontPressed=new ImageIcon();
	public static ImageIcon iconLoadSidePressed=new ImageIcon();
}
