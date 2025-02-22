
import java.util.Scanner;
import java.util.Random;
class Task1
{
    void numberGame()
    {
        Scanner sc=new Scanner(System.in);
        Random rn=new Random();
        boolean pAgain=true;
        while(pAgain)
        {
            int r =rn.nextInt(100)+1;//random number
            int a =0;//number of attempt
            boolean  c=false;
            while(c==false)
            {
                System.out.println("Enter your guess: ");
                int g=sc.nextInt();//guess
                a++;
                if(g==r)
                {
                    System.out.println("Congratulations! you guessed right!");
                    c=true;
                }
                else if(g>r)
                {
                    System.out.println("Too high! try again");
                }
                else
                {
                    System.out.println("Too low! try again");
                }
            }
            int score=calScore(a);
            System.out.println("you guessed correct in "+a+" attempts");
            System.out.println("your score= "+score);
            System.out.println("want to play next round?(yes/no): ");
            String  x =sc.next();
            if(x.equalsIgnoreCase("yes"))
            {
               pAgain=true;
            }
            else{
                pAgain=false;
                System.out.println("Thanks for playing!");
            }

        }
        sc.close();
    }

    int calScore(int a)
    {
        if(a<=2)
        {
            return 100;
        }
        else if(a<=4)
        {
            return 80;
        }
        else if(a<=6)
        {
            return 50;
        }
        else
        {
            return 30;
        }
       
    }
  public static void main(String[] args)
  {
    System.out.println("Welcome to  the Number Game!");
    System.out.println("Guess number between 1 and 100 ?");
    Task1 ob =new Task1();
     ob.numberGame();
  }
}