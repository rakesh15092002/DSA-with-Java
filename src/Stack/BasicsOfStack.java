package Stack;

import java.util.Scanner;

public class BasicsOfStack {
    public static int[] stack;
    static int top = -1;

    public static void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        top++;
        stack[top] = data;
    }

    public static int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int data = stack[top];
        top--;
        return data;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack[top];
    }

    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == stack.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        int n = sc.nextInt();
        stack = new int[n]; // 👈 Fixing shadowing

        push(1);
        push(2);
        push(3);
        push(4);


        System.out.println("Top element is: " + peek());
        System.out.println("Popped: " + pop());
        // System.out.println("Popped: " + pop());
        System.out.println("Top element is: " + peek());
    }
}
