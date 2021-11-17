/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taimurshah
 */
public class recursion {
    
    public int factorial(int n){
        Stack<Integer> st = new Stack<>(n);
        
        for(int i=n; i>=2 ; i--){
            st.push(i);
        }
        while(st.size() > 1){
            st.push(st.pop() * st.pop());
        }
        
        return st.pop();
    }
    
}
