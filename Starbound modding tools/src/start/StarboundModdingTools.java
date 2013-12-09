package start;

import java.awt.Dimension;

import javax.swing.JFrame;
//import javax.swing.JLabel;

public class StarboundModdingTools{

	public static void main(String[] args){
		createWindow();
	}
	
	public static void createWindow(){
		JFrame jframe = new JFrame("StarboundModdingTools - EightBitGamer");
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JLabel jlabel = new JLabel("Starbound Modding Tools - EightBitGamer");
//		jframe.getContentPane().add(jlabel);
		
		Dimension dimensions = new Dimension(600, 480);
		jframe.setSize(dimensions);
		
		jframe.pack();
		jframe.setVisible(true);
	}
}
