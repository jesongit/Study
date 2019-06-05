import java.util.*;
public class Stack {
    private Object[] stack;
    private int top, maxSize = 20, extendSize = 10;

    public Stack() {
        stack = new Object[maxSize];
        top = 0;
    }
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        extendSize = maxSize/2;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    public void extendStack() {
        maxSize += extendSize;
        Object[] tempStack = new Object[maxSize];
        for(int i = 0; i < top; ++i)
            tempStack[i] = stack[i];
        stack = tempStack;
    }

    public void clear() {
        top = 0;
    }
    public boolean isEmpty() {
        if(top == 0) return true;
        return false;
    }
    public int length() {
        return top;
    }
    public void push(Object o) throws Exception {
        if(top == maxSize)
            extendStack();
        stack[top++] = o;
    }
    public void pop() throws Exception {
        if(top == 0)
            throw new Exception("Stack is empty.");
        --top;
    }
    public Object getTop() {
        if(isEmpty()) return null;
        return stack[top-1];
    }
    public void display() {
        for(int i = 0; i < top; ++i)
            System.out.print(stack[i] + " ");
        System.out.println(); 
    }

    public static void main(String[] args) throws Exception {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.display();
        s.pop();
        s.display();
    }
}