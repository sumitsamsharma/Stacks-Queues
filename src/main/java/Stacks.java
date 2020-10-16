import java.util.LinkedList;
class Stack <T extends Comparable>
{
    private LinkedList l = new LinkedList();
    public void push(T a) {
        l.addFirst(a);
    }

}
public class Stacks {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(70);
        s.push(36);
        s.push(50);

    }
}
