package DsaProgress._47_SQ_Questns;

import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(3);
        s1.push(5);
        s1.push(4);
        s1.push(2);
        System.out.println(s1);
        System.out.println();
        System.out.println(sortStack(s1));
    }
    private static Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> sec = new Stack<>();
//        [1, 3, 5, 4, 2]
        while(!stack.isEmpty()){
            int temp = stack.pop();
            while (!sec.isEmpty() && sec.peek() > temp) {
                stack.push(sec.pop());
            }
            sec.push(temp);
        }
        return sec;
    }

}
