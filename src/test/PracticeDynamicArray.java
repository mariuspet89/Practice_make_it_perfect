package test;

import java.util.Arrays;

public class PracticeDynamicArray {

    public static void main(String[] args) {

        DynamicArray1 dynamicArray1 = new DynamicArray1(5);

        dynamicArray1.add("A");
        dynamicArray1.add("B");
        dynamicArray1.add("C");
        dynamicArray1.add("D");

        System.out.println(dynamicArray1);
        dynamicArray1.insert(0, "X");
        dynamicArray1.delete("X");
        System.out.println(dynamicArray1.search("C"));

        System.out.println(Arrays.toString(dynamicArray1.array));
        System.out.println("size: " + dynamicArray1.size);
        System.out.println("capacity:" + dynamicArray1.capacity);
        System.out.println("empty:" + dynamicArray1.isEmpty());


    }


}

class DynamicArray1 {

    //Actual size
    int size;
    //Actual capacity
    int capacity;

    Object[] array;

    public DynamicArray1() {
        this.array = new Object[capacity];
    }

    public DynamicArray1(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    public Object get(int index) {
        return array[index];
    }

    public void add(Object data) {
        if (size >= capacity) {
            grow();
        }
        array[size] = data;
        size++;
    }

    public void insert(int index, Object data) {
        if (size >= capacity) {
            grow();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {

        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                for (int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if (size <= (int) capacity / 3) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < size; i++) {
            if (array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    private void grow() {

        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {

        int newCapacity = (int) (capacity / 20);
        Object[] newArray = new Object[newCapacity];
        for(int i = 0; i<size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";

        for (int i = 0; i < size; i++) {
            string += array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }

}