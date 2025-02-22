
import java.util.Scanner;
class UserAccount
{
    private double balance;
    UserAccount( double initialBal)
    {
        this.balance=initialBal;

    }
    public double getBal()
    {
        return balance;
    }
    void deposit(double amt)
    {
        if(amt>0)
        {
            balance=balance+amt;
            System.out.println("Deposit Sucessful. New balance: "+balance);
        }
        else{
            System.out.println("Invalid Amount");
        }
    }
    void withdraw(double amt)
    {
        if(amt>0&&amt<=balance)
        {
            balance = balance-amt;
            System.out.println("Withdrawal Successful.balance left: "+balance);
        }
        else{
            System.out.println("invalid or insufficient amount for withdrawal");
        }
    }
}
class Atm{
    UserAccount acc;
    Atm(UserAccount account)
    {
      this.acc=account;
    }
     
    void menu()
    {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
          
          System.out.println("\n....Atm Interface....");
          System.out.println("1. Check Balance");
          System.out.println("2. Money Deposit ");
          System.out.println("3. Money Withdraw");
          System.out.println("4. Exit");
          System.out.println("choose one option: ");

          int ch=sc.nextInt();
          switch(ch)
          {
            case 1:
            System.out.println("Your balance: "+acc.getBal());
            break;
            case 2:
            System.out.println("Enter deposit amount: ");
            double depAmt=sc.nextDouble();
            acc.deposit(depAmt);
            break;
            case 3:
            System.out.println("Enter amount for withdrawal: ");
            double withAmt=sc.nextDouble();
            acc.withdraw(withAmt);
            break;
            case 4:
            System.out.println("Thank you. Visit Again !");
            sc.close();
            return;
            default:
                  System.out.println("Invalid choice");
          }

        }
    }
}
public class Task3 {
    public static void main(String[] args) {
        UserAccount acc=new UserAccount(1000.0);
        Atm atm=new Atm(acc);
        atm.menu();
    }
    
}
