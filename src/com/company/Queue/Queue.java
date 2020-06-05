package com.company.Queue;


import com.company.ArrayList.ArrayList;

public class Queue {
    ArrayList list;
    int size;

    public Queue() {
        list = new ArrayList();
        size = 0;
    }

    public Queue(int initialSize) {
        list = new ArrayList(initialSize);
        size = initialSize;
    }

    public void enqueue(int num) {
        list.add(num);
        size++;
        System.out.println(list.toString());
    }

    public int dequeue() {
        System.out.println("before dequeue "+list.toString());
        int removedNumber = list.remove(0);
        System.out.println("after dequeue "+list.toString());
        size--;
        return removedNumber;
    }

    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    public int peek() throws  Exception{
        if(size<0) throw new Exception("Queue is empty");
        return list.get(0);
    }

    public static void main(String[] args) throws Exception {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(10);
        queue.dequeue();
        queue.enqueue(3);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
