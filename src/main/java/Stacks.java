import java.util.LinkedList;
class Stack <T extends Comparable>
{
    private LinkedList l = new LinkedList();
    public void push(T a)
    {
        l.addFirst(a);
    }

    public Object top()
    {
        return l.getFirst();
    }
    public Object pop()
    {
        return l.removeFirst();
    }
    public void empty()
    {
        while(!l.isEmpty())
        {
            System.out.println("Popped elements: " + top());
            pop();
        }
    }

}
public class Stacks {
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(70);
        s.push(36);
        s.push(50);
        System.out.println("The top element of the stack is: " + s.top());
        s.empty();

    }
}
