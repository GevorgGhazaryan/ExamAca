package com.aca.exam;

import java.util.List;

public class CollectinTest {
    Collection<Integer> values = new Collection<>();

    public static void main(String[] args) {
        CollectinTest colectionTest = new CollectinTest();
        colectionTest.testAddByValue(6);
        colectionTest.testAddByIndex(1,1);
        colectionTest.testAddByIndex(1,2);
        colectionTest.testAddByValue(4);
        colectionTest.testAddByValue(5);
        colectionTest.testAddByValue(6);
        colectionTest.testAddByValue(7);
        colectionTest.testRemoveByIndex(3);
        colectionTest.testGet(3,5);
        colectionTest.testToSting();

    }
    public void testAddByValue(Integer value){
        values.addByValue(value);
        assert values.contains(value);
    }
    public void testAddByIndex(int i , Integer value){
        values.addByIndex(i,value);
        assert values.contains(value);
    }
    public void testGet(int index ,int equality){
      assert values.get(index).equals(equality);
    }

    public void testContains(Integer value){
        assert !values.contains(value);
    }

    public void testRemoveByIndex(int i) {
       assert values.removeByIndex(i);
    }

    public void testRemoveByValue(Integer value){
        assert values.removeByValue(value);
    }

    public void testToSting(){
        assert values.toString().equals("62157");
    }
}
