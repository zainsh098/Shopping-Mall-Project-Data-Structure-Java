
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shopping shop = new Shopping();
        Login log=new Login();
        int ch;
      

        do {
            System.out.println("\t\tWELCOME TO MAIN-PANEL AREA \n");
            System.out.println("\t\t 1) Cashier BLOCK ");
            System.out.println("\t\t 2) Customer BLOCK ");
            System.out.println("\t\t 3) EXIT ");




            System.out.println("   ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    log.Sec();
                    System.out.println("\t\t************* ADMINISTRATION SITE **************** \n");

                    shop.Admin();
                    break;
                case 2:
                    System.out.println("\t\tCustomer Block  ");
                    shop.buy();
                    break;
                
            }
        }
        while (ch != 3);
        System.out.println("\t\t ******  WELCOME ******  \n");
   	 System.out.println("\t\t| PROJECT NAME SHOPPING SIMULATOR | \n");
   	 System.out.println("\t=========================================================");
   	 System.out.println("\t\t\t    MADE BY   ");
   	 System.out.println("\t\t\t ZAIN SHAKOOR ");
   	 System.out.println("\t\t\t     FIZA  ");
   	 System.out.println("\t\t\t     RUBAB ");
   	 System.out.println("\t\t\t   BSCS-3B  ");
   	 
   	 
   	 System.out.println("\t********************************************");
   	 System.out.println("\t   <<<<<<<<<<<<<  THANKS  >>>>>>>>>>>>> \n");

    }



    }

