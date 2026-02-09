import java.util.Scanner;

class Bank {
    static String name; // null
    static long contact; // 0
    static int pin; // 0
    static double balance; // 0.0
    static final Long ACCOUNT_NUMBER = (Long)(long)(Math.random() * 1000000000L);

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (;;) {
        System.out.println("        WELCOME ");
        System.out.println("        LAXMI CHIT FUND");
        System.out.println();
        System.out.println("1. Existing User");
        System.out.println("2. Create Account");
        System.out.print("Enter option : ");
        switch (sc.nextInt()) {  //direct input given to the app from user 
            case 1: {
                System.out.println("");
           if (name == null) { 
               System.out.println("Create your account first ");
               continue;
           }
           System.out.println("        LOGIN ");
           System.out.println();
           System.out.print("Phone : ");
           long phone = sc.nextLong();
           System.out.print("Pin : ");
           int pin1 = sc.nextInt();
           if (contact == phone && pin1 == pin) {
               System.out.println();
               System.out.println("LOGIN SUCCESSFULLY");
               for (;;) {
                   System.out.println();
                   System.out.println("        HOME ");
                   System.out.println("1. DEPOSIT AMOUNT");
                   System.out.println("2. WITHDRAW AMOUNT");
                   System.out.println("3. CHECK BALANCE");
                   System.out.println("4. ACCOUNT INFO");
                   System.out.println("5. LOGOUT");
                   System.out.println();
                   System.out.print("Enter an option : ");
                   int opt = sc.nextInt();
                   System.out.println();
                   switch (opt) {
                       case 1: {
                           System.out.println("DEPOSIT MODULE");
                           System.out.print("Enter an amount : ");
                           double depositAmt = sc.nextDouble();
                           balance += depositAmt;
                           System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
                           break;
                           }
                           case 2: {
                               System.out.println("WITHDRAW MODULE");
                                   System.out.print("Enter the Amount : ");
                               double withdrawAmt = sc.nextDouble();
                               System.out.print("Enter your pin : ");
                               int pin2 = sc.nextInt();
                               if (pin2 == pin) 
                               {
                                   if (withdrawAmt <= balance) {
                                       balance -= withdrawAmt;
                                       System.out.println("AMOUNT WITHDRAWN SUCCESSFULLY");
                                   } else {
                                       System.out.println("INSUFFICIENT FUNDS");
                                   }
                               } else {
                                   System.out.println("INVALID PIN");
                                   continue;
                               }
                               break;
                           }
                           case 3: {
                               System.out.println("CHECK BALANCE MODULE");
                               System.out.print("Enter your pin : ");
                               int pin3 = sc.nextInt();
                               if (pin3 == pin) {
                                   System.out.println("AVAIL BALANCE IS : " + balance + "rs");
                               } else {
                                   System.out.println("INVALID PIN");
                                   continue;
                               }
                               break;
                           }
                           case 4: {
                               System.out.println("ACCOUNT INFO MODULE");
                               System.out.println();
                               System.out.println("ACCOUNT HOLDER NAME : " + name);
                               System.out.println("CONTACT : " + contact);
                               System.out.println("ACCOUNT NUMBER : " + ACCOUNT_NUMBER);
                               break;
                           }
                           case 5: {
                               System.out.println("THANK YOU AND VISIT AGAIN");
                               return;
                           }
                           default:
                               System.out.println("INVALID CREDENTIALS");
                               continue;
                       }
                   }
               } else {
                   System.out.println("INVALID CREDENTIALS");
                   continue;
               }
           
           case 2: {
               System.out.println("CREATE ACCOUNT ");
               System.out.print("Enter your name : ");
               name = new Scanner(System.in).nextLine();
               System.out.print("Contact number : ");
               contact = sc.nextLong();
               System.out.print("New Pin : ");
               pin = sc.nextInt();
               System.out.print("Amount Deposit : ");
               balance = sc.nextDouble();
               System.out.println("ACCOUNT CREATED SUCCESSFULLY");
               break;
           
           default:
               System.out.println("INVALID OPTION");
                    continue;
            }
        }
    }
}
