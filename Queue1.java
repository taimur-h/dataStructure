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
public class Queue1<T> {
    private final T arr[];
    private final int len;
    private int head = 0;
    private int tail = -1;
    public Queue1(int s){
        this.arr = (T[]) new Object[s];
        len = s-1;
    }
    public boolean isFull(){
        return tail >=len ;
    }
    public boolean isEmpty(){
        return head > tail;
    }
    
    public void enqueue(T val){
        if(isFull())
            System.out.println("Stack is full");
        else
            arr[++tail] = val; 
    }

    public T dequeue(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else
            return arr[head++];
    } 
    
}//end class
