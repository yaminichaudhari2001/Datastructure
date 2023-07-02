package bridzelabz.stack;

public class Stack <T> {
    Node head;
    public boolean isempty()
    {

        return head==null;
    }
    public void push(T number)
    {
        Node newnode=new Node(number);
        if (isempty()) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
    public void prints()
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.number);
            temp=temp.next;
        }
    }
}
