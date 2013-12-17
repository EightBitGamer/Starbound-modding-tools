package io.github.EightBitGamer.Starbound.moddingTools;

import java.io.File;

import io.github.EightBitGamer.Starbound.moddingTools.fileTypes.Item;
import io.github.EightBitGamer.Starbound.moddingTools.fileTypes.SBObject;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class StarboundModdingToolsWindow{

	private JFrame jframe;
	public StarboundModdingToolsWindow(JFrame jframe){
		this.jframe = jframe;
	}
	
	public void createWindow(String objectName, SBObject object, Item item, File image){
		JInternalFrame objectFrame = new JInternalFrame(objectName);
		
	}
}
