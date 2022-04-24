package com.wsb.generic;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Container<E> implements Collection<E> {

    List<E> customList;
    private int numberOfChange;

    public int getNumberOfChange() {
        return numberOfChange;
    }

    public Container() {
        this.customList = new LinkedList<>();
        this.numberOfChange = 0;
    }

    @Override
    public int size() {
        return 0;
    }

    public void printArray(){
        for (E value : customList){
            System.out.println(value);
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(E addValue) {
        try {
            customList.add(addValue);
            numberOfChange++;
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean remove(Object o) {
        try {
            customList.remove(o);
            numberOfChange++;
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }
}
