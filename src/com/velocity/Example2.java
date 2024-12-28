package com.velocity;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Example2 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("I");
		list.add("am");
		list.add("software");
		list.add("developer");
		StringJoiner sJoiner=new StringJoiner(",","[", "]");
		list.forEach(p->sJoiner.add(p));
		System.out.println(sJoiner);
	}

}
