/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author taimurshah
 */
public class ExpConv{
    
    
    // function will take expression in the form of string
    public String inToPost(String s){
        
        Stack<Character> st = new Stack<>(s.strip().length());
        String sExp = ""; // solve expression
        char ch;
        
        for(int i=0; i< s.length();i++){
            ch = s.charAt(i);
            
            if(Character.isLetterOrDigit(ch))
                sExp+=ch;
            
            else if(ch == '(')
                st.push(ch);
      
            else if(ch == ')')
            {
                // pop the items till (
                while(!st.isEmpty() && st.peak() != '(')
                    sExp+= st.pop();
                
                st.pop();// discard the () after encountring )
            }
            else{
                
                while(!st.isEmpty() && opPrec(ch) <= opPrec(st.peak()))
                    sExp+= st.pop();
                
                st.push(ch);// push the operator in the stack
            }

        }//endFor
        
        // pop every every thing left in the stack and put it in solve exp
        while(!st.isEmpty())
           sExp += st.pop();
        
        return sExp;
 }
    
    // check the precedence of the operators
    public int opPrec(char c){
        
        switch (c) {
            case '^':
                return 3;
            case '*': 
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                break;
        }
           return 0;
    }
    
    public String reverse(String s){
        String x = "";
        char ch;
  
        for(int i = s.length()-1; i>=0 ; i--){
            ch = s.charAt(i);
            
            if (ch == '(')
                 x+= ')';
              
            else if(ch == ')')
                x+= '(';
            
            else 
                x += ch;       
    }
    return x;
    }
    
    // convering infix to prefix
    public String inToPre(String s){
        s= this.reverse(s);
        s =this.inToPost(s);
        s =this.reverse(s);
        return s;
    }
}//endClass
