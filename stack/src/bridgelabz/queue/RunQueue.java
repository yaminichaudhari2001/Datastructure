package bridgelabz.queue;
//Ability to create a Queue of
//Ability to dequeue
//from the beginning
//-Use LinkedList to do the
//Queue Operations
public class RunQueue {
    public static void main(String[] args) {
        Queue ob=new Queue();
        ob.enqueue(10);
        ob.enqueue(20);
        ob.enqueue(30);
        ob.enqueue(40);
        ob.println();
        System.out.println();
        ob.dequeue();
        ob.println();


    }
}
