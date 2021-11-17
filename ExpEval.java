/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taimurshah
 */
public class ExpEval {
    
    public double postEval(String s){
        int len = s.strip().length();
        Stack<Character> st = new Stack<>(len / 2 ); // for operators
        Stack<Double> st1 = new Stack<>(len / 2 + 1);// for operands

        char ch;
        
        double opr1;
        double opr2;
        
        // pushing expression into stacks
        for(int i=0; i < len; i++)
        { 
            ch = s.charAt(i);
            
            while(Character.isDigit(ch)) //check if the character is digit 
            {
                st1.push( Double.parseDouble(ch+"")); // parsing the character into Double
                i++;
                ch = s.charAt(i);
            }
            st.push(ch); // pushing oprand into stack

            opr2 = st1.pop();
            opr1 = st1.pop();
            st1.push(calculate(opr1,st.pop(),opr2));
            
        }//endLoop
          
        return st1.pop(); // last element will be result
    }
    
    public double preEval(String s){
        int len = s.strip().length();
        Stack<Character> st = new Stack<>(len / 2 ); // for operators
        Stack<Double> st1 = new Stack<>(len / 2 + 1);// for operands

        char ch;

        // pushing expression into stacks
        for(int i=len-1; i >= 0; i--)
        { 
            ch = s.charAt(i);
            
            while(Character.isDigit(ch)) //check if the character is digit 
            {
                st1.push( Double.parseDouble(ch+"")); // parsing the character into Double
                i--;
                ch = s.charAt(i);
            }
            st.push(ch); // pushing oprand into stack
            st1.push(calculate(st1.pop(),st.pop(),st1.pop()));
            
        }//endLoop
          
        return st1.pop(); // last element will be result
    }
    
    public double calculate(double x, char op, double z){
        
        switch (op) {
            
            case '^' -> {
                for(int i=0; i <=z; i++){
                    x*=x;
                }
                return x;
            }
                
            case '*' -> { 
                return x * z;
            }
                
            case '/' -> {
                if(!(z==0))
                    return x/z;
                return 0;
            }
                
            case '+' -> {
                return x+z;
            }
                
            case '-' -> {
                return x-z;
            }
                
            default -> {
            }
         }
        return 0;
    }
    
}// end Class
