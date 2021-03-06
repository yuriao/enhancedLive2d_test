package enhancedLive2d_test;

import java.awt.Container;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TextureVar {
	
	public static JFrame welcomeframe=new JFrame(); //base container of all the elements
	public static Container layeredPane=welcomeframe.getLayeredPane();//there are multiple layers in the base container.
	public static double t=0;
	public static double tmax=0;
	public static double tmin=0;
	public static double Fs=100;
	
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
	public static JLabel forward=new JLabel();
	public static JLabel backward=new JLabel();
	
	public static Date tleftdate=new Date();
	public static Date trightdate=new Date();
	public static String formattedtleft = new String();
	public static String formattedtright = new String();
	
	public static Timeinputbox tbox=new Timeinputbox();
	
	public static ImageIcon icontimecontroller=new ImageIcon("texture/TimeController.png");//when pressed, change the image of "new game" button	
	public static ImageIcon iconforward=new ImageIcon("texture/forward.png");//when pressed, change the image of "new game" button	
	public static ImageIcon iconforwardPressed=new ImageIcon("texture/forwardpressed.png");//when pressed, change the image of "new game" button
	public static ImageIcon iconbackward=new ImageIcon("texture/backward.png");//when pressed, change the image of "new game" button	
	public static ImageIcon iconbackwardPressed=new ImageIcon("texture/backwardpressed.png");//when pressed, change the image of "new game" button	
	
	
	
	
	
	//character loading interface
	public static JLabel labelcharacterBackGround=new JLabel();
	public static JLabel labelCharacterHeadf=new JLabel();
	public static JLabel labelCharacterBodyf=new JLabel();
	public static JLabel labelCharacterLarmf=new JLabel();
	public static JLabel labelCharacterRarmf=new JLabel();
	public static JLabel labelCharacterLhandf=new JLabel();
	public static JLabel labelCharacterRhandf=new JLabel();
	public static JLabel labelCharacterLlegf=new JLabel();
	public static JLabel labelCharacterRlegf=new JLabel();
	public static JLabel labelCharacterHeadb=new JLabel();
	public static JLabel labelCharacterBodyb=new JLabel();
	public static JLabel labelCharacterLarmb=new JLabel();
	public static JLabel labelCharacterRarmb=new JLabel();
	public static JLabel labelCharacterLhandb=new JLabel();
	public static JLabel labelCharacterRhandb=new JLabel();
	public static JLabel labelCharacterLlegb=new JLabel();
	public static JLabel labelCharacterRlegb=new JLabel();
	public static JLabel labelCharacterHeads=new JLabel();
	public static JLabel labelCharacterBodys=new JLabel();
	public static JLabel labelCharacterArms=new JLabel();
	public static JLabel labelCharacterHands=new JLabel();
	public static JLabel labelCharacterLegs=new JLabel();
	public static JLabel labelFinish=new JLabel();
	public static JLabel labelLoadFront=new JLabel();
	public static JLabel labelLoadSide=new JLabel();
	public static JLabel labelLoadBack=new JLabel();
	public static ImageIcon iconcharacterBackGround=new ImageIcon();
	public static ImageIcon iconCharacterHeadf=new ImageIcon();	
	public static ImageIcon iconCharacterBodyf=new ImageIcon();
	public static ImageIcon iconCharacterLarmf=new ImageIcon();
	public static ImageIcon iconCharacterRarmf=new ImageIcon();
	public static ImageIcon iconCharacterLhandf=new ImageIcon();
	public static ImageIcon iconCharacterRhandf=new ImageIcon();
	public static ImageIcon iconCharacterLlegf=new ImageIcon();
	public static ImageIcon iconCharacterRlegf=new ImageIcon();
	public static ImageIcon iconCharacterHeads=new ImageIcon();	
	public static ImageIcon iconCharacterBodys=new ImageIcon();
	public static ImageIcon iconCharacterArms=new ImageIcon();
	public static ImageIcon iconCharacterHands=new ImageIcon();
	public static ImageIcon iconCharacterLegs=new ImageIcon();
	public static ImageIcon iconCharacterHeadb=new ImageIcon();	
	public static ImageIcon iconCharacterBodyb=new ImageIcon();
	public static ImageIcon iconCharacterLarmb=new ImageIcon();
	public static ImageIcon iconCharacterRarmb=new ImageIcon();
	public static ImageIcon iconCharacterLhandb=new ImageIcon();
	public static ImageIcon iconCharacterRhandb=new ImageIcon();
	public static ImageIcon iconCharacterLlegb=new ImageIcon();
	public static ImageIcon iconCharacterRlegb=new ImageIcon();
	public static ImageIcon iconFinish=new ImageIcon();
	public static ImageIcon iconLoadFront=new ImageIcon();
	public static ImageIcon iconLoadSide=new ImageIcon();
	public static ImageIcon iconLoadBack=new ImageIcon();
	public static ImageIcon iconFinishPressed=new ImageIcon();
	public static ImageIcon iconLoadFrontPressed=new ImageIcon();
	public static ImageIcon iconLoadSidePressed=new ImageIcon();
	public static ImageIcon iconLoadBackPressed=new ImageIcon();
}
