package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

public class Object extends Item{

	public Item itemFile;
	public Object(Item itemFile){
		this.itemFile = itemFile;
	}
	
//Orientations
	public String imagePath;
	public int[] imagePosition = new int[2];
	public int frames;
	public float animationCycle = 0.1f;
	public Anchors anchors;
}
