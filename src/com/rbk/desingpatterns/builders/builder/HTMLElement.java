package com.rbk.desingpatterns.builders.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
