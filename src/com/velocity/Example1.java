package com.velocity;

import java.util.ArrayList;
import java.util.List;


//why ?
public class Example1 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("I");
		list.add("am");
		list.add("software");
		list.add("developer");
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("[");
		for (int i = 0; i < list.size(); i++) {
			sBuffer.append(list.get(i) + ",");
		}
		sBuffer.append("]");
		System.out.println(sBuffer);
		//, write code 5-7 line of code, total code 32
	}

}
