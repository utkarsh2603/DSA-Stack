import java.util.Stack;

public class Next_Greater_Element
{
    public static void next_Greater_element(int array[],int nextGreater[]) {
        Stack<Integer> s = new Stack<>();

        for(int i= array.length-1;i>=0;i--) {
            while (!s.isEmpty() && array[s.peek()]<=array[i])
            {
                s.pop();
            }
            if(s.isEmpty())
            {
                nextGreater[i]=-1;
            }
            else
            {
                nextGreater[i]=array[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String[] args) {
        int array[]={6,8,0,1,3};
        int nextGreater[]=new int[array.length];

        next_Greater_element(array,nextGreater);

        for(int i=0;i<nextGreater.length;i++)
        {
            System.out.println(nextGreater[i]+" ");
        }
    }
}
