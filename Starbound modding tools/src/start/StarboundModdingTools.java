package start;

import io.github.EightBitGamer.Starbound.moddingTools.StarboundModdingToolsFileManager;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JList;


public class StarboundModdingTools{

	public StarboundModdingToolsFileManager fileManager = new StarboundModdingToolsFileManager();
	public JFrame jframe;
	public static void main(String[] args){
		
	}
	
	public void createJFrame(){
		jframe = new JFrame("Starbound Modding Tools - EightBitGamer");
		
		
		jframe.getContentPane();
	}
	
	public void refreshList(){
		List<String> list = new ArrayList<String>();
		JList jlist = new JList();
	}
	
	public JInternalFrame getJsonEditor(){
		return new JInternalFrame();
	}
}
