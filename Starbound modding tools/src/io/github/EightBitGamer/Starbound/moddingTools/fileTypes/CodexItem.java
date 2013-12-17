package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

public class CodexItem extends Item{

	public String[] varsTypes = {"String|1|itemName", "Rarity|1|itemName", "String|1|InventoryIcon", "String|1|Description", "String|1|shortDescription", "Race|1|race", "String|-1|learnBlueprints", "String|1|codexKind"};
	public Item itemFile;
	public CodexItem(){}
//TODO add vars to class from ITEM
	public CodexItem(Item itemFile){
		this.itemFile = itemFile;
	}
	public String codexKind = "codex";
}
