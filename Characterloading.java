package enhancedLive2d_test;

public class Characterloading {
	
	public Characterloading(){
	TextureVar.layeredPane.add(TextureVar.labelBackGround, new Integer(3));
	TextureVar.labelBackGround.setBounds(0,0,1000,600); //background size
	
	TextureVar.layeredPane.add(TextureVar.labelCharacterBodyf, new Integer(3));
	TextureVar.labelCharacterBodyf.setBounds(300,100,300,800); //background size
	TextureVar.layeredPane.add(TextureVar.labelCharacterBodyf, new Integer(3));
	TextureVar.labelCharacterBodyf.setBounds(300,100,300,800); //background size
	}
}
