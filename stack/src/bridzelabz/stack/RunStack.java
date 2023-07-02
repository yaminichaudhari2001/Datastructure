package bridzelabz.stack;
//Ability to peak and
//pop from the Stack
//till it is empty
//56
//->30
//
//->70
//
//- Use LinkedList to do the Stack
//Operations
public class RunStack {
    public static void main(String[] args) {
        Stack ob=new Stack();
        ob.push(70);
        ob.push(30);
        ob.push(56);
        ob.prints();
        ob.pop();
        ob.peep();
    }
}
