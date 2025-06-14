package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();

    public  void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());

        }
        q1.offer(data);

        while (!q2.isEmpty()) {
            q1.offer(q2.poll());
        }

    }

    public int pop(){
        if(q1.isEmpty()) {
            return -1;
        }
        int data = q1.poll();
        return data;
    }

    public int peek(){
       if(q1.isEmpty()) {
            return -1;
        }
        int data = q1.element();
        return data;
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue st = new ImplementStackUsingQueue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("top element is : "+st.peek());
        System.out.println("removed element is : "+st.pop());
        System.out.println("top element is : "+st.peek());

    }



}
