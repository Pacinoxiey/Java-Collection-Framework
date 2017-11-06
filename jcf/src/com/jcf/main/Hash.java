package com.jcf.main;

import java.util.HashMap;

/**
 * @author xiey
 * @version 2017年10月26日 下午2:11:51
 * @describe HashMap HashSet
 */
public class Hash {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "sss");
		map.put(1, "www");
		System.out.println(map);
	}
}
