package com.rbk.desingpatterns.builders.builder;


public class HTMLBuilder {
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

