package com.wsb.generic;

import java.util.*;
import java.util.function.UnaryOperator;

public class ContainerWithMemory<E> extends Container<E>{

    Map<Integer, List<E>> version;
    List<E> containerListMemory;
    int id =0;

    public ContainerWithMemory() {
       this.version = new HashMap<>();
       this.containerListMemory = new ArrayList<>();

    }


    @Override
    public boolean add(E addValue) {
        try {
            containerListMemory.add(addValue);
            id++;
            version.put(id, new ArrayList<>(containerListMemory));
            return true;

        }catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean remove(Object o) {
        try {
            containerListMemory.remove(o);
            id++;
            version.put(id, new ArrayList<>(containerListMemory));
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public void restoreVersion(int id){
        containerListMemory.clear();
        containerListMemory.addAll(version.get(id));



    }
}
