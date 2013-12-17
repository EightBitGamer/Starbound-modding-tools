package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

import java.util.List;

public class Codex{

	public String[] varsTypes = {"String|1|id", "String|1|title", "String|-1|pages"};
	public String id;
	public String title;
	public List<String> pages;
	
	public void addPage(int index){
		pages.add(index, "");
	}
	public void addPage(){
		pages.add("");
	}
	
	public String getPage(int index){
		return pages.get(index);
	}
	public void updatePage(int index, String pageContent){
		pages.set(index, pageContent);
	}
	public void clearPage(int index){
		pages.remove(index);
	}
	public void clearCodex(){
		pages.clear();
	}
}
