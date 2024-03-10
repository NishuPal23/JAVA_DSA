package Stack;
import java.util.*;
public class EvaluationOfInfixExpression {
    public static int evaluateInfix(String str){
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            int num = (int)ch;
            if(num>=48 && num<=57){
                operand.push(num-48);
            }
            else{
                if(operator.isEmpty()){
                    operator.push(ch);
                }
                else{
                    
                   
                    if(ch=='+'||ch=='-'){
                        int val2 = operand.pop();
                        int val1 = operand.pop();
                        char op = operator.pop();
                        if(op=='+'){
                            operand.push(val2+val1);

                        }
                        else if(op=='-'){
                            operand.push(val1-val2);
                        }
                        else if(op=='*'){
                            operand.push(val1*val2);
                        }
                        else{
                            operand.push(val1/val2);
                        }
                        operator.push(ch);
                    }
                    else if(ch=='*'||ch=='/'){
                        int val2 = operand.pop();
                        int val1 = operand.pop();
                        char op = operator.pop();
                        if(op=='*'){
                            operand.push(val1*val2);
                        }
                        else if(op=='/'){
                            operand.push(val1/val2);
                        }
                        operator.push(ch);
                    }
                    else{
                        operator.push(ch);
                    }
                }
            }
        }
        while(operand.size()>1){
            int val2 = operand.pop();
            int val1 = operand.pop();
            char op = operator.pop();
            if(op=='+'){
                operand.push(val2+val1);

            }
            else if(op=='-'){
                operand.push(val1-val2);
            }
            else if(op=='*'){
                operand.push(val1*val2);
            }
            else{
                operand.push(val1/val2);
            }
            
            
        }
        return operand.peek();
    }
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        int ans = evaluateInfix(str);
        System.out.println(ans);
    }
}
