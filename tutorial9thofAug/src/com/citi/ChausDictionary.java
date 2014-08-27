package com.citi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ChausDictionary
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<String> chaus = new ArrayList<String>();
		chaus.add("Kapil");
		chaus.add("isGetting");
		chaus.add("married");

		System.out.println(chaus);
		for (String sting : chaus)
		{
			System.out.println(sting);
		}

		Map<String, String> dict = new TreeMap<String, String>();
		dict.put("bandhu", "bro");
		dict.put("jhakas", "rocking");
		dict.put("kaisenho", "wassup");

	}

}
