package com.aca.exam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Collection<T> implements Iterable {
    private List<T> values;

    public Collection(List<T> values) {
        this.values = values;
    }

    public Collection() {
        this.values = new LinkedList();
    }

    public void addByValue(T value){
        if(!contains(value)){
            values.add(value);
        }
    }
    public void addByIndex(int i , T value){
        if(!contains(value)){
            values.add(i, value);
        }
    }
    public T get(int i){
        return values.get(i);
    }

    public boolean contains(T value){
        return values.contains(value);
    }

    public boolean removeByIndex(int i) {
        if (values.remove(i) == null) {
            return false;
        }
        return true;
    }

    public boolean removeByValue(T value){
        if(values.remove(value)){
            return true;
        }
        return false;
    }

    public String toSting(){
        String toString = "";
        for(T value : values){
           return  toString += value;
        }
    }
    @Override
    public Iterator iterator() {
        return values.iterator();
    }
}
