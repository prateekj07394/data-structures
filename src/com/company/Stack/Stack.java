package com.company.Stack;

import com.company.ArrayList.ArrayList;

public class Stack {
    ArrayList list;

    public Stack(){
        list = new ArrayList();
    }

    public void push(int num){
        list.add(num);
    }
    public int pop(){
        return list.removeLast();
    }
    public boolean isEmpty(){
        return list.size()==0;
    }
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(15);
        System.out.println(stack.pop());
    }
}
