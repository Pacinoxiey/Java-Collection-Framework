package com.jcf.main;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author xiey
 * @version 2017年10月26日 下午2:11:51
 * @describe HashMap HashSet
 */
public class Hash {
    public static void main(String[] args) {

//        test1();
        test2();
    }

    private static int hash(Object key) {
        int h;
        int c = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        System.out.println("hash:" + c);
        return c;
    }

    private static void test1(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "sss");
        map.put(1, "www");
        System.out.println(map);

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        int n = 16;
        String a = "a";
        int hash = hash(a);

        System.err.println("取余数:" + hash % 16);

        int l1 = (n - 1) & hash;
        System.err.println(l1);
        n = 32;
        int l2 = (n - 1) & hash;
        System.err.println(l2);
    }

    private static void test2(){
        System.err.println(hash(1));
        System.err.println(hash(12));
    }
}
