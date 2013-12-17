package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

public class SBObject extends Item{

	public String[] varsTypes = {"String|1|itemName", "Rarity|1|itemName", "String|1|InventoryIcon", "String|1|Description", "String|1|shortDescription", "Race|1|race", "String|-1|learnBlueprints", "String|1|image", "int|2|imagePosition", "int|1|frames", "float|1|animationCycle", "Anchors|1|anchors"};
	public Item itemFile;
	public SBObject(){}
	public SBObject(Item itemFile){
		this.itemFile = itemFile;
	}
	
//Orientations
	public String imagePath;
	public int[] imagePosition = new int[2];
	public int frames;
	public float animationCycle = 0.1f;
	public Anchors anchors;
}
