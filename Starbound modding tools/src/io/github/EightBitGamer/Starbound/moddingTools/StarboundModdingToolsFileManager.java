package io.github.EightBitGamer.Starbound.moddingTools;


import io.github.EightBitGamer.Starbound.moddingTools.fileTypes.FileTypes;

import java.util.ArrayList;
import java.util.List;

public class StarboundModdingToolsFileManager{

	private List<Object> files = new ArrayList<Object>();
	private List<String> fileNames = new ArrayList<String>();
	private List<FileTypes> fileTypes = new ArrayList<FileTypes>();
	
	public boolean newObject(FileTypes type, String name){
		if(!fileNames.contains(name)){
			files.add((FileTypes.getNewObject(type, name)));
			fileNames.add(name);
			fileTypes.add(type);
			return true;
		}
		return false;
	}
	
	public void removeObject(String name){
		int index = fileNames.indexOf(name);
		files.remove(index);
		fileNames.remove(index);
		fileTypes.remove(index);
	}
}
