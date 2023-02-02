public class Stack_Using_LinkedList
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class Stack
    {
        static Node head=null;

        //isEmpty
        public static boolean isEmpty()
        {
            return head==null;
        }

        //push()
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }

        //pop()
        public static int pop()
        {
            int top=head.data;
            if(isEmpty())
            {
                return -1;
            }
            head=head.next;
            return top;
        }

        //peek()
        public static int peek()
        {
            return head.data;
        }
    }
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.push(10);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
