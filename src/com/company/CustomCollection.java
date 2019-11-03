package com.company;

public interface CustomCollection {
    boolean add(String str);

    boolean addFirst(String str);


    String[] delete (String str);

    String get(int index);

    boolean contains(String str);

    boolean clear();

    int size();


}

