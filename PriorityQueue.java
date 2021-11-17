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
public class PriorityQueue<T> {
    
    private final Queue2<T> q1;
    private final Queue2<T> q2;
    private final Queue2<T> q3;
   
    public PriorityQueue(int val){
        q1 = new Queue2<>(val);
        q2 = new Queue2<>(val);
        q3 = new Queue2<>(val);
    }
    
    public void enqueue(T val, int p){
        
        if(p <0)
            System.out.println("precedence should only be +ive number");
        else if( p <= 1 && !(q1.isFull()) )
            q1.enqueue(val);
        else if( p ==2 && !(q2.isFull()) )
            q2.enqueue(val);
        else if( p>=3 && !(q2.isFull()) )
            q3.enqueue(val);
        else
            System.out.println("queue is full");
 
    }
    public T dequeue(){
        if(!q1.isEmpty())
            return q1.dequeue();
        else if(!q2.isEmpty())
            return q2.dequeue();
        else if(!q3.isEmpty())
            return q3.dequeue();
        System.out.println("queue is empty");
        return null;
    }
    
    
    
}
