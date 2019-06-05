
public class Queue {
    private class Node {
        private Object data;
        private Node next;
        public Node(Object data) {
            this.data = data;
            next = null;
        }
    }
    private int size = 0;
    private Node head = null, tail = null;

    public void clear() {
        head = tail = null;
    }
    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }
    public void push(Object o) {
        Node n = new Node(o);
        if(head == null)
            head = tail = n;
        else {
            tail.next = n;
            tail = n;
        }
    }
    public void pop() throws Exception {
        if(head == null)
            throw new Exception("Queue is empty.");
        head = head.next;
    }
    public void display() {
        for(Node n = head; n != null; n = n.next)
            System.out.print(n.data + " ");
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        Queue q = new Queue();
        q.push(1); q.push(2); q.push(3); q.display();
        q.pop(); q.display();
    }
}