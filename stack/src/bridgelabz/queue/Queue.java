package bridgelabz.queue;

public class Queue {
    Node1 head=null;
    Node1 tail=null;
    public boolean isempty()
    {
        return head==null&&tail==null;
    }
    public void enqueue(int number)
    {
        Node1 newnode=new Node1(number);
        if(isempty())
        {
            System.out.println("queue is empty");
        }
        if(tail==null)
        {
            head=tail=newnode;
            return;

        }
        tail.next=newnode;
        tail=newnode;

    }
    public void println()
    {
        Node1 temp=head;
        while (temp!=tail.next)
        {
            System.out.print(temp.number+"<---");
            temp=temp.next;
        }

    }
}
