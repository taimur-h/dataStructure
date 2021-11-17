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
public class circularQue<T> {
    
    T arr[];
    int head;
    int tail;
    int size;
    
    public circularQue(int val){
        this.arr = (T[]) new Object[val];
        this.size = val;
    }
    
    public boolean isEmpty(){
        return tail< head;
    }
    
    public boolean isFull(){
        return tail == head + size -1;
    }
    
    public void enqueue(T val){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
            tail++;
            arr[tail%size]= val;
        }
    }
    public T dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        else{
            T val= arr[head%size];
            head++;
            return val;
        }
    }
    
    public int size(){
        return (tail-head)+1;
    }
    
}// end class
