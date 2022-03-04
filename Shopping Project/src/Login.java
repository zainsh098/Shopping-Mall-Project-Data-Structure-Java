import java.util.Scanner;
public class Login {
    Scanner sc=new Scanner(System.in);

    public void Sec() {
        String user;
  
        int pass;

        System.out.println("\t\tEnter Username  ");
        user = sc.next();
        System.out.println("\t\tEnter Password ");
        System.out.println("\t");pass = sc.nextInt();
        if (user.equals("Zain") && (pass == 1234)) {
            System.out.println(" ACCESS GRANTED\n");
        } else {
            System.out.println("\t*** ERROR ...Sorry YOU Have Entered Wrong Credinetals \n");
            System.out.println("\t ------>>>>>> PLEASE TRY AGAIN ");

            }

    }
}

