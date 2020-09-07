package DataStructer;


import java.util.Arrays;

class Stack {
    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;


    public void expand() {
        capacity = capacity * 2;
        int newStack[] = new int[capacity];

        System.arraycopy(stack, 0, newStack, 0, top);
        stack = newStack;


    }

    public void push(int data) {
        if (top == capacity) {
            expand();
        }
        stack[top] = data;
        top++;

    }

    public void pop() {
        top--;
    }

    public void show() {
        for (int i = 0; i < top; i++) {
            System.out.println(stack[i]);
        }
    }
}

class StackMain {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(1);
        stack.push(12);
        stack.push(13);
        stack.push(100);
        stack.push(1);
        stack.pop();

        System.out.println("-------------");
        stack.show();
    }
}
