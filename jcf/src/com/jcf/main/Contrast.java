package com.jcf.main;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author xiey
 * @version 2017年10月26日 下午3:08:56
 * @describe 各容器的比较
 */
public class Contrast {

	private static HashSet<String> hashSet = new HashSet<>();
	//Map m = Collections.synchronizedMap(new LinkedHashMap(...));
//	private static LinkedHashMap<Integer, String> synSet = (LinkedHashMap<Integer, String>) Collections.synchronizedMap(new LinkedHashMap<>());

	private static HashMap<Integer, String> hashMap = new HashMap<>(100);// 初始容量

	private static Hashtable<Integer, String> hashtable = new Hashtable<>();

	private static LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

	public static void main(String[] args) {
		hashSet.add("aa");
		hashSet.add("bb");
		hashSet.add("cc");
		hashSet.remove("bb");
		hashMap.put(null, null);
		
		// table.put(key, value)
		// set.
		Iterator<String> i = hashSet.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());

		}
	}
}
