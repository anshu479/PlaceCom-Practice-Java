public class Stack {
    static Stack stack = new Stack();
    public static class Node {
        Node next;
        Integer data;
        Node() {
            this.next = null;
            this.data = null;
        }
    }

    static Node stackNode;
    int size = 0;

    public static void push(int data) {
        if(stackNode == null) {
            stackNode.data = data;
            stack.size++;
        }
        else {
            Node temp = new Node();
            temp.data = data;
            temp.next = stackNode;
            stackNode = temp;
            stack.size++;
        }

    }

    public static int pop() {
        if(stackNode != null) {
            int val = stackNode.data;
            stackNode = stackNode.next;
            stack.size--;
            return val;

        }
        return -1;
    }

    public static int size() {
       return stack.size;
    }

    public static int peek() {
        if(stackNode != null) {
            return stackNode.data;
        }
        return -1;
    }

    public static boolean isEmpty() {
        if(stack.size == 0) {
            return true;
        }
        return false;
    }

    public static void display() {
        Node temp = stackNode;
        while(temp != null) {
            if(temp.data != null)
                System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        stackNode = new Node();
        push(5);
        push(6);
        push(7);
        push(8);
        display();
        System.out.println();
        pop();
        pop();
        display();
        System.out.println();
        System.out.println(size());
        System.out.println(isEmpty());
        pop();
        pop();
        System.out.println(size());
        System.out.println(isEmpty());
        display();

    }
}
