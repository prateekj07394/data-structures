package com.company.ArrayList;

public class ArrayList {
    int[] arr;
    int size;
    int capacity;

    public ArrayList() {
        this.arr = new int[10];
    }

    public ArrayList(int initialSize) {
        this.arr = new int[initialSize];
        this.capacity = initialSize;
        this.size = 0;
    }

    public void add(int num) {
        if (size == (capacity / 2) - 1) {
            //increase space of array
            capacity *= 2;
            int[] temp = new int[capacity];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            temp[size ] = num;
            arr = temp;
        } else {
            //just add to end
            arr[size ] = num;
        }
        size++;
    }

    public int remove(int index) {
        if (index < 0 || index > size - 1) throw new IllegalArgumentException("Enter a valid value");
        int ans;
        if(index==size-1){
            ans = removeLast();
        }else{
            ans = arr[index];
            int nextValue = arr[arr.length - 1];
            for(int i = arr.length - 2; i >= index ; i--){
                int temp = arr[i];
                arr[i] = nextValue;
                nextValue = temp;
            }
            size--;
        }
        return ans;
    }
    public int removeLast(){
        if(size==0) throw new IllegalArgumentException("Array list is empty");
        int lastNumber = arr[size-1];
        size--;
        return lastNumber;
    }
    public String toString(){
        String res = "";
        for(int i = 0; i < size; i++){
            res += arr[i]+" ";
        }
        return res;
    }

    public int get(int index){
        if(index<0 || index>size-1) throw new IllegalArgumentException("Provide a valid index");
        int ans = arr[index];
        return ans;
    }

    public int size(){
        return arr.length;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.toString());
        //list.remove(-2);
        list.removeLast();
        System.out.println(list.toString());
        list.remove(0);
        System.out.println(list.toString());
    }
}
