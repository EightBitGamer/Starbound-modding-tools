package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

public enum FileTypes{CODEX, CODEXITEM, FRAMES, ITEM, OBJECT;

	public static Object getNewObject(FileTypes type, String name){
//TODO add name to construct?
		if(type.equals(FileTypes.CODEX)){
			return new Codex();
		}
		else if(type.equals(FileTypes.CODEXITEM)){
			return new CodexItem();
		}
		else if(type.equals(FileTypes.FRAMES)){
			return new Frames();
		}
		else if(type.equals(FileTypes.ITEM)){
			return new Item();
		}
		else if(type.equals(FileTypes.OBJECT)){
			return new SBObject();
		}
		return new Object();
	}

}
