package com.rbk.desingpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Demo {
	public static void main(String[] args) {
		HTMLBuilder builder = new HTMLBuilder("ul");
		builder.addChild("li", "hello");
		builder.addChild("li", "world");
		System.out.println(builder);
	}
}


class HTMLBuilder {
	private String rootName;
	private HTMLElement root = new HTMLElement();

	public HTMLBuilder(String rootName) {
		this.rootName = rootName;
		root.name = rootName;
	}

	public void addChild(String childName, String childText){
		HTMLElement e = new HTMLElement(childName, childText);
		root.elements.add(e);
	}

	public void clear(){
		root = new HTMLElement();
		root.name = rootName;
	}

	public String toString(){
		return root.toString();
	}
}

class HTMLElement {
	public String name, text;
	public List<HTMLElement> elements = new ArrayList<>();

	private final int indentSize = 2;
	private final String newLine = System.lineSeparator();

	public HTMLElement(){}

	public HTMLElement(String name, String text){
		this.name = name;
		this.text = text;
	}

	public String toStringImpl(int indent) {
		StringBuilder sb = new StringBuilder();
		String i = String.join("", Collections.nCopies(indent * indentSize, " "));
		sb.append(String.format("%s<%s>%s", i, name, newLine));
		if (text != null && !text.isEmpty())
		{
			sb.append(String.join("", Collections.nCopies(indentSize*(indent+1), " ")))
					.append(text)
					.append(newLine);
		}

		for (HTMLElement e : elements)
			sb.append(e.toStringImpl(indent + 1));

		sb.append(String.format("%s</%s>%s", i, name, newLine));
		return sb.toString();
	}

	@Override
	public String toString()
	{
		return toStringImpl(0);
	}
}