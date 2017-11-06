package com.jcf.main;

import java.util.TreeMap;

/**
 * @author xiey
 * @version 2017年10月25日 下午1:49:55
 * @describe 红黑树
 */
public class Tree {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		treeMap.put(1, "a");
		treeMap.remove(1);
	}

	/**
	 * 出于性能原因，TreeMap是非同步的（not
	 * synchronized），如果需要在多线程环境使用，需要程序员手动同步；或者通过如下方式将TreeMap包装成（wrapped）同步的：
	 * 
	 * SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...));
	 */
	
	//Rotate Left
//	private void rotateLeft(Entry<K,V> p) {
//	    if (p != null) {
//	        Entry<K,V> r = p.right;
//	        p.right = r.left;
//	        if (r.left != null)
//	            r.left.parent = p;
//	        r.parent = p.parent;
//	        if (p.parent == null)
//	            root = r;
//	        else if (p.parent.left == p)
//	            p.parent.left = r;
//	        else
//	            p.parent.right = r;
//	        r.left = p;
//	        p.parent = r;
//	    }
//	}
}
