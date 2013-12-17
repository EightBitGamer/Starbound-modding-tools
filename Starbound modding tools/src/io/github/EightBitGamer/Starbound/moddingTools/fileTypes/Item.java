package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

import java.util.List;

public class Item {

	public String[] varsTypes = {"String|1|itemName", "Rarity|1|itemName", "String|1|InventoryIcon", "String|1|Description", "String|1|shortDescription", "Race|1|race", "String|-1|learnBlueprints"};
	public String itemName;
	public Rarity rarity;
	public String inventoryIconPath;
	public String description;
	public String shortDescription;
	public Race race;
	
	public boolean learnBlueprints;
	public List<String> blueprintsOnPickup;

}
