package com.jcf.nsyw.class3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author xiey
 * @date 2019/1/10 16:57
 * @description：
 */
public class Class3 {
    //47587300ns
    //24938000ns
    public static void main(String args[]) {

        //Deque<Integer> q = new ArrayDeque<>();
        Deque<Integer> q = new LinkedList<>();
        Deque<Integer> a = new ArrayDeque<>();
        long begin = System.nanoTime();
        test(a);
        long end = System.nanoTime();
        System.out.println("took " + (end - begin) + "ns");
    }

    public static void test(Deque<Integer> q) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 10_000; j++) {
                q.addLast(j);
            }

            for (int j = 0; j < 10_000; j++) {
                q.removeFirst();
            }
        }
    }
}
