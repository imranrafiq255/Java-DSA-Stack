public class Stack {
    private static class Node {
        private int data;
        private Node next;
        Node()
        {
            data = 0;
            next = null;
        }
    }
    private Node top;
    Stack()
    {
        top = null;
    }
    public void push(int data)
    {
        Node n = new Node();
        n.data = data;
        if (top == null)
        {
            top = n;
            return;
        }
        n.next = top;
        top = n;
    }
    public void peek()
    {
        System.out.println("The element at peak is: " + top.data);
    }
    public void pop()
    {
        if (top == null)
        {
            System.out.println("Stack is underflow, you can't remove any item");
            return;
        }
        Node temp = top;
        top = top.next;
        temp = null;
    }
    public void findElement(int key)
    {
        if (top == null)
        {
            System.out.println("Stack is underflow");
            return;
        }
        if (top.next == null)
        {
            if (top.data == key)
            {
                System.out.println("The element with key of " + key + " is found successfully");
                return;
            }
        }
        Node temp = top;
        boolean isFound = false;
        while(temp != null)
        {
            if(temp.data == key)
            {
                System.out.println("The element with key of " + key + " is found successfully");
                isFound = true;
                break;
            }
            temp = temp.next;
        }
        if (!isFound)
        {
            System.out.println("The element with key of " + key + " is not found from the Stack");
        }
    }
    public void display()
    {
        if (top == null)
        {
            System.out.println("Stack is underflow");
            return;
        }
        Node temp = top;
        while(temp != null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
