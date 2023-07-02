package bridgelabz.queue;
//Ability to create a Queue of
//56->30->70
//- Use LinkedList to do the Queue
//Operations
//- Here enqueu will internally call append
//method on LinkedList.
//- So 56 will be added first then 30 and
//then 70 to make 56 on top of the Stack
public class RunQueue {
    public static void main(String[] args) {
        Queue ob=new Queue();
        ob.enqueue(10);
        ob.enqueue(20);
        ob.enqueue(30);
        ob.enqueue(40);
        ob.println();


    }
}
