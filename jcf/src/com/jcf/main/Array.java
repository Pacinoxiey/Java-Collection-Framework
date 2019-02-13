package com.jcf.main;

import java.util.ArrayList;

/**
 * @author xiey
 * @version 2017年10月24日 下午2:06:01
 * @describe ArrayList 顺序容器 异步属性 可以放入null capacity默认大小10, 容量不足自动扩容
 */
public class Array<E> {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();// 参数化类型
        list.add("aaa");
        list.add(null);
        list.add(1, "dd");
        System.out.println(list.size());
        System.out.println(list.set(0, "www"));// 替换, 返回旧值
        System.out.println(list.remove("www"));// 按值删除
        System.out.println(list);
    }

    /**
     * set方法
     */
    // public E set(int index, E element) {
    // rangeCheck(index); //下标越界检查
    // E oldValue = elementData(index);
    // elementData[index] = element;//赋值到指定位置，复制的仅仅是引用
    // return oldValue; //返回旧值
    // }
    /**
     * get方法
     */
    // public E get(int index) {
    // rangeCheck(index);
    // return (E) elementData[index];//注意类型转换
    // }
    /**
     * add addAll()同理
     */
    // public boolean add(E e) {
    // ensureCapacityInternal(size + 1); // Increments modCount!!
    // elementData[size++] = e;
    // return true;
    // }
    /**
     * add到指定位置 addAll()同理
     */
    // public void add(int index, E element) {
    // rangeCheckForAdd(index);
    //
    // ensureCapacityInternal(size + 1); // Increments modCount!!
    // System.arraycopy(elementData, index, elementData, index + 1,
    // size - index);
    // elementData[index] = element;
    // size++;
    // }
    /**
     * 自动扩容
     */
    // private void grow(int minCapacity) {
    // int oldCapacity = elementData.length;
    // int newCapacity = oldCapacity + (oldCapacity >> 1);//原来的1.5倍
    // if (newCapacity - minCapacity < 0)
    // newCapacity = minCapacity;
    // if (newCapacity - MAX_ARRAY_SIZE > 0)
    // newCapacity = hugeCapacity(minCapacity);
    // elementData = Arrays.copyOf(elementData, newCapacity);//扩展空间并复制
    // }

}
