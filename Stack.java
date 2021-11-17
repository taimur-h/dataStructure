/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taimurshah
 * @param <T>
 */

public class Stack <T> {

    private final T[] arr;
    private int top = -1;

    public Stack(int n){
        this.arr = (T[]) new Object[n];
    }

    public boolean isEmpty(){
        return this.top < 0;
    }
    public boolean isFull(){
        return this.top >= arr.length-1;
    }

    public void push(T x){
        if(isFull())
            System.out.println("stack is full");
        arr[++top] = x;
    }

    public T pop(){
        if(isEmpty())
            return null;
        return this.arr[top--];
    }

    public T peak(){
        if(isEmpty())
            return null;
        return this.arr[top];
    }
    
    public int size(){
        return top+1;
    }
    
}

