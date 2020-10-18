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

    public void dequeue()
    {
        if(this.front==null)
            return;
        node temp=this.front;
        this.front=this.front.next;
        if(this.front==null)
            this.rear=null;
    }

}

public class Queues {
    public static void main(String[] args)
    {
        Queue q = new Queue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.enqueue(70);
        System.out.println("Queue front: "+q.front.key);
        q.dequeue();
        System.out.println("Queue end: "+q.rear.key);
    }
}
