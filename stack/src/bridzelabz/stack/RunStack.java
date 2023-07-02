package bridzelabz.stack;
//Ability to create a Stack of
//56->30->70
//- Use LinkedList to do the Stack
//Operations
//- Here push will internally call add method
//on LinkedList.
//- So 70 will be added first then 30 and
//then 56 to make 56 on top of the Stack
public class RunStack {
    public static void main(String[] args) {
        Stack ob=new Stack();
        ob.push(70);
        ob.push(30);
        ob.push(56);
        ob.prints();
    }
}
