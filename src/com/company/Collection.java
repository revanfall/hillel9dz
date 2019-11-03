package com.company;

import java.util.Arrays;

public class Collection implements CustomCollection {
    String linkedList[];
    int counter;

    public Collection() {
        linkedList = new String[0];
    }

    public String[] increaseList(){
        String newList[]=new String[linkedList.length+1];
        for(int i=0;i<counter;i++){
            newList[i]=linkedList[i];
        }
        return newList;
    }

    @Override
    public boolean add(String str) {
        if(counter+1>linkedList.length)
            linkedList=increaseList();
        linkedList[counter]=str;
        counter++;
        return true;
    }

    @Override
    public boolean addFirst(String str) {
        String newList[]=new String[linkedList.length+1];
        for (int i=0;i<counter;i++){
            newList[0]=str;
            newList[i+1]=linkedList[i];
        }
        linkedList=increaseList();
        System.out.println(newList[counter]);
           for(int i=0;i<counter;i++){
            linkedList[i]=newList[i];
        }
        linkedList[counter]=newList[counter];
    return true;
    }

    @Override
    public String[] delete(String str) {
        for(int i=0;i<counter;i++) {
            if (linkedList[i].equals(str)) {
                linkedList[i]=null;
                for (;i+1<linkedList.length;i++){
                    linkedList[i]=linkedList[i+1];
                }
            }
        }
        counter--;
        String newList[]=new String[linkedList.length-1];
        for(int i=0;i<counter;i++){
            newList[i]=linkedList[i];
        }
        newList[counter]=linkedList[counter];
        System.out.println(Arrays.toString(newList));
        return newList;
    }

    @Override
    public String get(int index) {
        return linkedList[0];
    }

    @Override
    public boolean contains(String str) {
        for(int i=0;i<counter;i++){
            if(linkedList[i]!=str)
                return true;
        }
        return true;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return counter;
    }

    @Override
    public String toString() {
        return "Collection{" +
                "linkedList=" + (linkedList == null ? null : Arrays.asList(linkedList)) +
                '}';
    }
}
