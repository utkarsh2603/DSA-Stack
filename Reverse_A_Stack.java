import java.util.Stack;

public class Reverse_A_Stack
{
    public static void pushAtBottom(Stack<Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static void reverseAStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top=s.pop();
        reverseAStack(s);
        pushAtBottom(s,top);
    }
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push((1));
        s.push((2));
        s.push((3));
        s.push((4));
        s.push((5));
        s.push((6));
        s.push((7));
        s.push((8));
        s.push((9));
        s.push((10));



        reverseAStack(s);

        while ((!s.isEmpty()))
        {
            System.out.println(s.peek());
            s.pop();
        }


    }
}
