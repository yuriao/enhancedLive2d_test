package enhancedLive2d_test;

public class Characterloading {
	
	public Characterloading(){
	TextureVar.layeredPane.add(TextureVar.labelcharacterBackGround, new Integer(3));
	TextureVar.labelcharacterBackGround.setBounds(0,0,1000,600); //background size
	TextureVar.labelcharacterBackGround.setIcon(TextureVar.iconcharacterBackGround);
	
	TextureVar.layeredPane.add(TextureVar.labelCharacterBodyf, new Integer(3));
	TextureVar.labelCharacterBodyf.setBounds(300,100,300,800); //background size
	TextureVar.layeredPane.add(TextureVar.labelCharacterLarmf, new Integer(3));
	TextureVar.labelCharacterLarmf.setBounds(300,100,300,800); //background size
	TextureVar.layeredPane.add(TextureVar.labelCharacterRarmf, new Integer(3));
	TextureVar.labelCharacterRarmf.setBounds(300,100,300,800); //background size
	}
}
