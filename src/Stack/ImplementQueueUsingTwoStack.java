package Stack;

import java.util.Stack;

public class ImplementQueueUsingTwoStack {
    static Stack<Integer> st1 = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();

    public void offer(int data){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(data);
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
    }

    public int element(){
        if(st1.isEmpty()){
            return -1;
        }
        int data = st1.peek();
        return data;
    }

    public int poll(){
        if(st1.isEmpty()){
            return -1;
        }
        int data = st1.pop();
        return data;
    }
    public int queueSize(){
        if(st1.isEmpty()){
            return -1;
        }
        return st1.size();

    }

    public static void main(String[] args) {
        ImplementQueueUsingTwoStack queue = new ImplementQueueUsingTwoStack();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println("front elemnt in queue : "+ queue.element());
        System.out.println("removed element is : "+ queue.poll());
        System.out.println("front elemnt in queue : "+ queue.element());
        System.out.println("size of the element is : " + queue.queueSize());
    }


    
}
