import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int pin_no=1234;
        int balance=5000;
        int dept_amt=0;
        int credit_amt=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your PIN number:");
        int pin=sc.nextInt();
        if(pin==pin_no)
        {
            System.out.println("Enter your Name:");
            String name=sc.next();
            System.out.println("WELCOME "+name);
            while(true)
            {
                System.out.println("Press 1 to check the balance");
                System.out.println("Press 2 to deposit the amount");
                System.out.println("Press 3 to to withdrawl the amount");
                System.out.println("Press 4 to EXIT!!!");
                int opt=sc.nextInt();
                switch(opt)
                {
                 case 1:
                     System.out.println("Your current balance is Rs."+balance);
                     break;
                 case 2:
                    System.out.println("Enter a amount:");
                    dept_amt=sc.nextInt();
                    System.out.println("SUCESSFULLY DEBITED!!!");
                    balance+=dept_amt;
                    break;
                 case 3:
                     System.out.println("Enter a amount:");
                     credit_amt=sc.nextInt();
                     if(credit_amt>balance)
                     {
                      System.out.println("Insufficient Balance!!!");
                      System.out.println("Try less amount");
                     }
                     else
                     {
                     System.out.println("SUCESSFULLY CREDITED!!!");
                     balance-=credit_amt;
                     System.out.println("Current Balance is: "+balance);
                     }
                     break;
                }
                if(opt==4)
                {
                    System.out.println("THANK YOU!!!");
                    break;
                }
            }
        }
        else{
            System.out.println("Wrong PIN number.");
        }
    }
}