// https://leetcode.com/problems/basic-calculator-ii/description/

// Given a string s which represents an expression, evaluate this expression and return its value. 

// The integer division should truncate toward zero.

// You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].

// Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

 

// Example 1:

// Input: s = "3+2*2"
// Output: 7
// Example 2:

// Input: s = " 3/2 "
// Output: 1
// Example 3:

// Input: s = " 3+5 / 2 "
// Output: 5
 

// Constraints:

// 1 <= s.length <= 3 * 105
// s consists of integers and operators ('+', '-', '*', '/') separated by some number of spaces.
// s represents a valid expression.
// All the integers in the expression are non-negative integers in the range [0, 231 - 1].
// The answer is guaranteed to fit in a 32-bit integer.


class Solution {
    public int calculate(String s) {
          int l = s.length();
        Stack<Integer> intStack = new Stack<>();
        Stack<Character> optStack = new Stack<>();
        for(int i =0; i< l ; i++){
            char c = s.charAt(i);
            int prev = i;            
            if(Character.isDigit(c)){
                while(i<l && Character.isDigit(s.charAt(i))){
                    i++;
                }
                int val = Integer.valueOf(s.substring(prev, i));
                if(!optStack.isEmpty() && optStack.peek() == '-'){
                    val = -val;
                    optStack.pop(); 
                    optStack.push('+'); 
                }
                intStack.push(val);
                if(!optStack.isEmpty()){
                    if(optStack.peek() == '*'){
                      intStack.push(intStack.pop()*intStack.pop());
                      optStack.pop();
                    }else if(optStack.peek() == '/'){
                        int v1 = intStack.pop();
                        int v2 = intStack.pop();
                        intStack.push(v2/v1);
                        optStack.pop();
                    }
                }
                i--;
            }else if(c != ' '){
                optStack.push(c);
            }
        }
        while(!optStack.isEmpty()){
            if(optStack.pop() == '+'){
                intStack.push(intStack.pop()+intStack.pop());
            }
        }
        return intStack.pop();   
        
    }
}

