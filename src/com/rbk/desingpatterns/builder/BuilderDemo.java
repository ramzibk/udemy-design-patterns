package com.rbk.desingpatterns.builder;

public class BuilderDemo {
	public static void main(String[] args) {
		HTMLBuilder builder = new HTMLBuilder("ul");
		builder.addChild("li", "hello");
		builder.addChild("li", "world");
		System.out.println(builder);
	}
}
