package com.nam.ds.arraylist;

public interface List {

    void add(int element);

    void insertAt(int index, int element);

    int get(int index);

    int size();

    int remove(int index);

    boolean contains(int element);

    int indexOf(int element);

}
