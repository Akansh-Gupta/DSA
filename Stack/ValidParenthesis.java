import java.util.Scanner;

public class ValidParenthesis {
    public static void main(String[] args) {
        StackLinkedList st = new StackLinkedList();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = true;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                st.push(ch);
            }
            else if(ch == '}'){
                if(st.pop() != '{'){
                    flag = false;
                    break;
                }
            }
            else if(ch == ')'){
                if(st.pop() != '('){
                    flag = false;
                    break;
                }
            }
            else if(ch == ']'){
                if(st.pop() != '['){
                    flag = false;
                    break;
                }
            }
        }
        if(flag && st.isempty()){
            System.out.println("Valid parenthesis");
        }
        else{
            System.out.println("Invalid parenthesis");
        }
        sc.close();
    }
}

//Pseudocode: 
// isBalanced(expression):
// creata an empty stack
// for every character ch:
//     if ch is opening bracket
//         push ch
//     else if ch is closing bracket
//         if stack empty
//             return false
//     top = pop()
//     if pair mismatch
//         return false
// if stack empty
//     return true
// else
//     return false