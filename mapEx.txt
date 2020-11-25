package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapEx {
	
	public static void main(String[] args) {
		Map<String, ArrayList<String>> multiValueMap = new HashMap<String, ArrayList<String>>();

		multiValueMap.put("CS", new ArrayList<String>());
		multiValueMap.put("EC",new ArrayList<String>());
		multiValueMap.get("CS").add("Student 1");
		multiValueMap.get("EC").add("Student 3");
		multiValueMap.get("EC").add("Student 4");
		multiValueMap.get("CS").add("Student 2");
		
		System.out.println("CS:"+multiValueMap.get("CS"));
		System.out.println("EC:"+multiValueMap.get("EC"));
	}

}
