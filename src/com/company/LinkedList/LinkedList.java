package com.company.LinkedList;

public class LinkedList {
    //properties
    Node head;
    int size;

    //methods
    // add
    public void add(int num) {
        if (size == 0) {
            addFirst(num);
        } else {
            addLast(num);
        }
    }

    public void add(int num, int index) {
        if (index > size - 1 || index < 0) {
            throw new IllegalArgumentException("Please enter a valid index");
        } else {
            int counter = 0;
            Node node = head;
            while (counter < index - 1) {
                node = node.next;
                counter++;
            }
            Node newNode = new Node(num);
            newNode.next = node.next;
            node.next = newNode;
            size++;
            System.out.println("successfully added a new node with value " + num + " at index " + index);
        }
    }

    //addFirst
    public void addFirst(int n) {
        Node newNode = new Node(n);
        Node temp = head;
        newNode.next = temp;
        head = newNode;
        size++;
        System.out.println(n + " successfully added to the first");
    }

    //addLast
    public void addLast(int n) {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }
        Node newNode = new Node(n);
        node.next = newNode;
        size++;
        System.out.println(n + " successfully added to the last");
    }

    //remove
    public void remove(int index) {
        if (index > size - 1 || index < 0) throw new IllegalArgumentException("Please enter a valid index");
        if (index == 0) {
            removeFirst();
        } else {
            int counter = 0;
            Node node = head;
            while (counter < index - 1) {
                node = node.next;
                counter++;
            }
            node.next = node.next.next;
            size--;
            System.out.println("successfully removed node at index " + index);
        }
    }

    //removeFirst
    public void removeFirst() {
        Node node = head.next;
        head = node;
        size--;
        System.out.println("successfully removed first element");
    }

    //removeLast
    public void removeLast() throws Exception {
        if (size == 0) {
            throw new Exception("No elements in the linked list, please add an element in the list to rmeove the last element");
        } else {
            Node node = head;
            while (node.next.next != null) {
                node = node.next;
            }
            node.next = null;
            size--;
        }
    }

    //isEmpty
    public boolean isEmpty() {
        return size == 0 ? true : false;
    }

    //toString
    public String toString() {
        String res = "";
        int count = 0;
        Node node = head;
        while (node != null) {
            res += "At index " + count + " value is " + node.val + "\n";
            node = node.next;
            count++;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(-2);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println(linkedList.toString());
        linkedList.removeLast();
        System.out.println(linkedList.toString());
        linkedList.remove(0);
        System.out.println(linkedList.toString());
    }
}

class Node {
    int val;
    Node next;

    public Node(int num) {
        this.val = num;
    }
}
