package DsaProgress._48_SQ_Questns;

import java.util.Stack;
// PUSH EFFICIENTLY
public class _01_QueueUsingStack {
    Stack<Integer> first;
    Stack<Integer> second;

    public _01_QueueUsingStack() {
        this.first = new Stack<>();
        this.second = new Stack<>();
    }

    public void insert(int num) {
        first.push(num);
    }

    public int remove() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int peek = first.peek();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peek;
    }
    public void display(){
        System.out.println(first);
    }
}
class Main{
    public static void main(String[] args) {
        _01_QueueUsingStack queue = new _01_QueueUsingStack();
        queue.insert(20);
        queue.insert(120);
        queue.insert(201);
        queue.insert(210);
        queue.display();
    }
}
