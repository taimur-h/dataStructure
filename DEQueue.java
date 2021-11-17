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
public class DEQueue<T> {
    private final T arr[];
    private final int len;
    private int tail = -1;
    
    public DEQueue(int s){
        this.arr = (T[]) new Object[s];
        len = s-1;
    }
    public boolean isFull(){
        return tail >=len ;
    }
    public boolean isEmpty(){
        return 0 > tail;
    }
    
    public void enqueueTail(T val){
        if(isFull())
            System.out.println("queue is full");
        else
            arr[++tail] = val; 
    }
    
    public T dequeueTail(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return null;
        }
        else
            return arr[tail--];
    }

    public void enqueueHead(T val){
        if(isFull()){
            System.out.println("queue is full");
        }
        else{
           movebwd();
           arr[0] = val;
        }
    }
    
    public T dequeueHead(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return null;
        }
        else{
            T x = arr[0];
            movefwd();
            return x;

        }
    } 
    
    private void movefwd(){
        for(int i=1; i <= this.tail; i++){
            arr[i-1] = arr[i];
        }
        tail--;
    }
    
    private void movebwd(){
        for(int i=tail; i>=0; i--){
            arr[i+1] = arr[i]; 
        }
        tail++;
    }
    
}//end class

