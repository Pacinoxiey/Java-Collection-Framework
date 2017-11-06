package com.jcf.main;

import java.util.ArrayDeque;

/**
* @author xiey
* @version 2017年10月24日 下午4:25:25
* @describe 循环队列deque
*/
public class Deque {
	public static void main(String[] args) {
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
//		arrayDeque.add(e)
//		arrayDeque.addLast(e);
//		arrayDeque.addFirst(e);
	}
	
	//addFirst(E e)
//	public void addFirst(E e) {
//	    if (e == null)//不允许放入null
//	        throw new NullPointerException();
//	    elements[head = (head - 1) & (elements.length - 1)] = e;//2.下标是否越界
//	    if (head == tail)//1.空间是否够用
//	        doubleCapacity();//扩容
//	}	
	
	//doubleCapacity()分两步, 1.先获取一个两倍于原数组的数组, 再把旧值复制过去,2.复制插入值进去
//	private void doubleCapacity() {
//	    assert head == tail;
//	    int p = head;
//	    int n = elements.length;
//	    int r = n - p; // head右边元素的个数
//	    int newCapacity = n << 1;//原空间的2倍
//	    if (newCapacity < 0)
//	        throw new IllegalStateException("Sorry, deque too big");
//	    Object[] a = new Object[newCapacity];
//	    System.arraycopy(elements, p, a, 0, r);//复制右半部分，对应上图中绿色部分
//	    System.arraycopy(elements, 0, a, r, p);//复制左半部分，对应上图中灰色部分
//	    elements = (E[])a;
//	    head = 0;
//	    tail = n;
//	}
	/**
	 * pollFirst()返回并且删除第一个元素
	 * peekFirst()返回第一个元素
	 */
//	public E pollFirst() {
//	    E result = elements[head];
//	    if (result == null)//null值意味着deque为空
//	        return null;
//	    elements[h] = null;//let GC work
//	    head = (head + 1) & (elements.length - 1);//下标越界处理
//	    return result;
//	}
	
}
