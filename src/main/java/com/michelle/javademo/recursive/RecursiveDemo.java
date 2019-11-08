package com.michelle.javademo.recursive;

public class RecursiveDemo {
    public static void main(String[] args) {
        int r = get(0);
        System.out.println(r);
    }

    public static int get(int i) {
        if (i == 10) {
            return i;
        }
        int j = get(i + 1);
        return i + j;
    }
}
