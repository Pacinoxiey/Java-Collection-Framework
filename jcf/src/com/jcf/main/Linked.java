package com.jcf.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.print.DocFlavor.STRING;

/**
 * @author xiey
 * @version 2017年10月24日 下午3:11:35
 * @describe LinkedList
 *           LinkedList同时实现了List接口和Deque接口，也就是说它既可以看作一个顺序容器，又可以看作一个队列（Queue），
 *           同时又可以看作一个栈（Stack）。这样看来，LinkedList简直就是个全能冠军。当你需要使用栈或者队列时，
 *           可以考虑使用LinkedList，一方面是因为Java官方已经声明不建议使用Stack类，更遗憾的是，
 *           Java里根本没有一个叫做Queue的类（它是个接口名字）。关于栈或队列，现在的首选是ArrayDeque，
 *           它有着比LinkedList（当作栈或队列使用时）有着更好的性能。
 *           为追求效率LinkedList没有实现同步（synchronized），
 *           如果需要多个线程并发访问，可以先采用Collections.synchronizedList()方法对其进行包装
 */
public class Linked {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		ArrayList<String> aList = new ArrayList<>();
		list.remove(1);
		list.add("aaa");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		List<String> synList = Collections.synchronizedList(new LinkedList<>());//实现同步
		List<String> synArray = Collections.synchronizedList(aList);
	}
	/**
	 * add(E e)
	 */
//	add(int index, E element) 先找到index的位置, 修改引用完成添加
//	public boolean add(E e) {
//	    final Node<E> l = last;
//	    final Node<E> newNode = new Node<>(l, e, null);
//	    last = newNode;
//	    if (l == null)
//	        first = newNode;//原来链表为空，这是插入的第一个元素
//	    else
//	        l.next = newNode;
//	    size++;
//	    return true;
//	}
	
	/**
	 * remove()
	 * remove()方法也有两个版本，一个是删除跟指定元素相等的第一个元素remove(Object o)，
	 * 另一个是删除指定下标处的元素remove(int index)。都通过unlink来操作
	 */
	//unlink(Node<E> x)，删除一个Node
//	E unlink(Node<E> x) {
//	    final E element = x.item;
//	    final Node<E> next = x.next;
//	    final Node<E> prev = x.prev;
//	    if (prev == null) {//删除的是第一个元素
//	        first = next;
//	    } else {
//	        prev.next = next;
//	        x.prev = null;
//	    }
//	    if (next == null) {//删除的是最后一个元素
//	        last = prev;
//	    } else {
//	        next.prev = prev;
//	        x.next = null;
//	    }
//	    x.item = null;//let GC work
//	    size--;
//	    return element;
//	}
	/**
	 * get(int index)得到指定下标处元素的引用，通过调用上文中提到的node(int index)方法实现。
	 */
//	public E get(int index) {
//	    checkElementIndex(index);//index >= 0 && index < size;
//	    return node(index).item;
//	}
	
/**
 * set(int index, E element)方法将指定下标处的元素修改成指定值，
 * 也是先通过node(int index)找到对应下表元素的引用，然后修改Node中item的值。
 */
//	public E set(int index, E element) {
//	    checkElementIndex(index);
//	    Node<E> x = node(index);
//	    E oldVal = x.item;
//	    x.item = element;//替换新值
//	    return oldVal;
//	}
}
