package com.jcf.main;
/**
* @author xiey
* @version 2017年10月26日 下午5:21:45
* @describe LinkedHashMap
*/
public class LinkedHash {
	public static void main(String[] args) {
		
	}
	// LinkedHashMap.addEntry()
//	void addEntry(int hash, K key, V value, int bucketIndex) {
//	    if ((size >= threshold) && (null != table[bucketIndex])) {
//	        resize(2 * table.length);// 自动扩容，并重新哈希
//	        hash = (null != key) ? hash(key) : 0;
//	        bucketIndex = hash & (table.length-1);// hash%table.length
//	    }
//	    // 1.在冲突链表头部插入新的entry
//	    HashMap.Entry<K,V> old = table[bucketIndex];
//	    Entry<K,V> e = new Entry<>(hash, key, value, old);
//	    table[bucketIndex] = e;
//	    // 2.在双向链表的尾部插入新的entry
//	    e.addBefore(header);
//	    size++;
//	}
}
