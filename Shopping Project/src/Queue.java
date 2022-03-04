import java.util.Scanner;

public class Queue {
    int count=0;
Node front=null;
Node rear=null;
Scanner sc=new Scanner(System.in);
//Node1 n1;
public  void enqueue(String name)
{

    Node newNode=new Node();
    newNode.name=name;
    newNode.next=null;
    if(rear==null)
    {
        front=newNode;
    }
    else
    {
        rear.next=newNode;
    }
    rear=newNode;
    count++;
}
    public void deque()
    {
        int index;
        System.out.println("\tEnter 0 to Deque Customer from List : ");
        index=sc.nextInt();
        if(index==0)
        {
            front=front.next;
            count--;
            System.out.println("\t THE CUSTOMER IS Dequed ");
        }
    }
        public void peek()
        {
            if(front==null)
        {

            System.out.println("\tThe queue is empty ");
        }
            else
        {
            System.out.println("\t The Front Customer Name is ="+front.name);

        }


        }
        public void isEmpty()
    {
        if(front==null)
        {

            System.out.println("The queue is empty");
        }
        else
        {
            System.out.println("The queue is not empty");

        }

    }
    public void size()
    {
        System.out.println("\t Length of Queue ="+ count);


    }



        public void Show()
        {
            Node current=front;
            while(current!=null)
            {
                System.out.println("\t\t"+current.name);
                current=current.next;
            }


        }

}
