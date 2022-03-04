
import javax.swing.*;
import java.util.Scanner;
class Shopping {
    Queue q = new Queue();
    Node head = null;
    //Node tail = null;
    Scanner sc = new Scanner(System.in);
    int input = sc.nextInt();

    public void start() {
        int id;
        int quant;
        String name;
        double pri;
        Node newNode = new Node();
        Node current = head;
        System.out.println("\tEnter The Product id =");
        id = sc.nextInt();
        newNode.ID = id;
        System.out.println("\tEnter The Product Name =");
        name = sc.next();
        newNode.proName = name;
        System.out.println("\tEnter The Product Price =");
        pri = sc.nextDouble();
        newNode.proprice = pri;
        System.out.println("\tEnter The Product Quantity =");
        quant = sc.nextInt();
        newNode.quantity = quant;

        if (head == null) {
            head = newNode;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
        }
        System.out.println("\t The Product is inserted\n");


    }

    public Node search(int id) {
        Node current = head;
        if (current == null) {
            System.out.println("\tLINKLIST IS EMPTY");
            return null;
        } else {
            while (current.next != null) {
                if (current.ID == id) {
                    System.out.println("\tID FOUND\n");
                    return current;
                }
                current = current.next;
            }
            if (current.ID == id) {
                System.out.println("\tID FOUND\n");
                return current;
            }
        }
        return null;
    }

    public void Modify() {
        int id;
        double price;
        String pName;
        int nid;
        int nq;
        if (head == null) {
            System.out.println("\tList Is Empty\n");
        } else {
            show();

            System.out.println("\t\tEnter Id to Modify Products Details");
            System.out.println("======================================================================");
            System.out.println("\t\t\t "); id = sc.nextInt();
            Node current = search(id);
            if (current != null) {
                System.out.println("\tYOUR ENTERTED ID IS FOUND ");

                System.out.println("\n");
                System.out.println("\tOLD ID :" + current.ID);
                System.out.println("\tOLD NAME :" + current.proName);
                System.out.println("\tOLD PRICE :" + current.proprice);
                System.out.println("\tOLD Quantity :" + current.quantity);

                System.out.println("\n");
                System.out.println("\tEnter New The Product Id =");
                nid = sc.nextInt();
                current.ID = nid;
                System.out.println("\tEnter New The Product Name =");
                pName = sc.next();
                current.proName = pName;
                System.out.println("\tEnter New The Product Price =");
                price = sc.nextDouble();
                current.proprice = price;
                System.out.println("\tEnter New The Product Quantity =");
                nq = sc.nextInt();
                current.quantity = nq;
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                System.out.println("\tYOUR DATA ENTERED SUCCESSFULLY ");
                System.out.println("\t\t   ~~~~~~~    AND  ~~~~~~~         ");
                System.out.println("\t  RECORD UPDATED SUCCESSFULLY \n");


            } else {
                System.out.println("\t YOUR ID IS NOT FOUND TRY AGAIN \n");


            }
        }
    }


    public void delete() {
        if (head == null) {

            System.out.println("List is Empty ");
        } else {
            int id;
            show();
            System.out.println("\t\t Enter ID to delete That Product =");
            id = sc.nextInt();
            Node current =head;
           if(current.ID==id)
           {
               if (current.next!=null)
               {
                   head=head.next;
               }
               else
               {
                   head=null;
               }

           }
           else
           {
              while (current.next!=null)
              {
                  if (current.next.ID==id)
                  {
                      Node temp=current.next;
                      current.next=temp.next;
                      temp=null;
                      return;
                  }
                  current=current.next;
              }
//

           }
           System.out.println("\t THE PRODUCT IS DELETED");
        }
        System.out.println("\t THE PRODUCT IS DELETED");
    }







    public int show() {

        Node current = head;
        System.out.println("\t*********************************************************");
        System.out.println("\t\t+++++++ EXISTINGS PRODUCTS ARE +++++++  \n");
        System.out.println("ID \t\t Products Name \t\t Price \t\t Quantity");
        System.out.println("\t--------------------------------------------------");
        while (current != null) {
            System.out.print(current.ID + "\t\t" + current.proName + "\t\t" + current.proprice + "\t\t" +(current.quantity) + "");
            current = current.next;
            System.out.println("\n");
        }
        return 0;
    }


    public void buy() {
        Node current = head;
        show();
        int id, quantity, count, no, i ;
        if (head == null) {
            System.out.println("\t\tList is Empty \n\n ");

        } else {
            // count = show();
            System.out.println("\t Enter The ID Of That Product You Want To Buy =");
            id = sc.nextInt();
            //System.out.println("Enter The Quantity Of that Product ");
            // quantity = sc.nextInt();
            Node n = search(id);
            if (n == null) {
                System.out.println("\tID NOT FOUND\t");
            } else {
                System.out.println("\tEnter The Quantity Of that Product =");
                quantity = sc.nextInt();
                if (n.quantity < quantity) {
                    System.out.println("\tThe Quantity You Entered Is Not Available =");

                } else {
                    System.out.println("\tENTER  CUSTOMER  NAME  :");
                    String name = sc.next();
                    q.enqueue(name);
                    double totalprice = n.proprice * quantity;
                    System.out.println("***********************************************************");
                    System.out.println("\t\t ----------  PRINTING BILL ----------");
                    System.out.println("\tCUSTOMER NAME :" + name);
                    System.out.println("\tITEM NAME  :" + n.proName);
                    System.out.println("\tTOTAL QUANTITY:" + quantity);
                    System.out.println("\tTOTAL PRICE ::" + totalprice+"\n");


                        System.out.println("\t||||||||||||   THANKS FOR BEING HERE    ||||||||||||||| \n");



                }
            }
        }

    }

    
        //DISPLAY FUNCTION HERE
    int ch;
    public int Admin ()
    {

        System.out.println("\tPRESS 1 TO Insert Product  ");
        System.out.println("\tPress 2 to Modify Record ");
        System.out.println("\tPress 3 to Display ");
        System.out.println("\tPress 4 to DELETE ");
        System.out.println("\tPress 5 to See customer list ");
        System.out.println("\tPress 6 Deque Customer from list ");
        System.out.println("\tPress 7 to See Front Customer ");
        System.out.println("\tPress 8 to See Queue Length ");
        System.out.println("\tPress 0 to Back At Any \n");
        System.out.println("\tENTER YOU CHOICE ");
        ch = sc.nextInt();
        switch (ch) {

            case 1:
                start();
                return Admin();

            case 2:
                Modify();
                return Admin();
            case 3:
                show();
                return Admin();
            case 4:
                delete();
                return Admin();
                case 5:
                    System.out.println("\t**********   THE LIST OF CUSTOMER THAT ARE IN QUEUE ********** ");
                    q.Show();
                    return Admin();
            case 6:

                q.deque();
                System.out.println("The Customer Is dequeed ");
                return Admin();
            case 7:
                System.out.println("\t *****  THE NAME OF CUSTOMER IS THE FRONT ******* \n");
                q.peek();
                return Admin();
            case 8:
                q.size();
                return Admin();
        }

        return 0;
    }



}



