package com.game.extend;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
	public static final List<Integer> list = new ArrayList<Integer>(); 
	public static void main(String[] args){
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Gson gson = new Gson();
		String str = gson.toJson(list);
		System.err.println(str);
		
		
		List<Integer> listi = gson.fromJson(str, new TypeToken<List<Integer>>(){}.getType()); 
		for (int i : listi) {
			System.err.println(i);
		}
	}
	
	
	
}
