package DsaProgress._47_Stack_Queues.Stack;

public class StackMain {
    public static void main(String[] args) throws StackException {
//        CustomStack stack = new CustomStack(5);
//        stack.push(20);
//        stack.push(40);
//        stack.push(60);
//        stack.push(80);
//        stack.display();
//        System.out.println();
//        stack.pop();
//        stack.display();
//        stack.push(100);
//        stack.push(200);
//        stack.push(900);
//        stack.display();
//        stack.pop();
//        stack.display();
//        System.out.println();
//        stack.push(20);
//        stack.display();

        DynamicStack stack = new DynamicStack(4);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
//        stack.display();
        stack.push(20);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.push(20);
        stack.push(40);
        stack.push(60);
        stack.push(80);
        stack.display();

    }
}
