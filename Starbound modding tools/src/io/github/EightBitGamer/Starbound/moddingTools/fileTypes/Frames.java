package io.github.EightBitGamer.Starbound.moddingTools.fileTypes;

import java.util.List;

public class Frames{

	public String[] varsTypes = {"int|2|size", "int|2|dimentions", "int|1|frames", "String|-1|names"};
	public int[] size = new int[2]; //frame size
	public int[] dimentions = new int[2]; //image size
	public int frames = 1;
	public List<String> names;
}
