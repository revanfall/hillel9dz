package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> l=new LinkedList<>();


        Collection c=new Collection();
        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");
        c.add("6");
        System.out.println(c.toString());
        c.addFirst("15");
        System.out.println(c.toString());
        c.delete("2");
    }
}
