import java.util.Stack;

public class Stack_Using_Collections_Framework
{
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(23);
        s.push(33);
        s.push(43);
        s.push(53);
        s.push(63);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
