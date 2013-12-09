package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

public class CodexItem extends Item{

	public Item itemFile;
	public CodexItem(Item itemFile){
		this.itemFile = itemFile;
	}
	public String codexKind = "codex";
}
