

class Queue {

    class node {
        int key;
        node next;

        public node(int key)
        {
            this.key = key;
            this.next = null;
        }
    }
    node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int key) {
        node temp = new node(key);

        if (this.rear == null) {
            this.front = temp;
            this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }
    
}

public class Queues {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(40);
        q.enqueue(50);
    }
}

