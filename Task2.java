
import java.util.Scanner;

public class Task2 {
    
    void gradeCal()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int s = sc.nextInt();
        int total=0;
        for(int i =1;i<=s;i++)
        {
            System.out.println("Enter marks obtained in subject "+i+"  (out of 100):");
            int marks=sc.nextInt();
            total=total+marks;
        }
        double avg = (double)total/s;
        String gr=" ";
        sc.close();
        if(avg>=100||avg<0)
        {
            System.out.println("Invalid Input");
        }
       else if(avg>90&&avg<100)
        {
            gr="A+";
        }
        else if(avg>75&&avg<=90)
        {
            gr="A";
        }
        else if(avg>60&&avg<=75)
        {
            gr="B";
        }
        else if(avg>45&&avg<=60)
        {
            gr="C";
        }
        else if(avg>=33&&avg<=45)
        {
            gr="D";
        }
        else 
        {
            gr="F";
        }

        System.out.println("\n.....RESULT.....");
        System.out.println("Total Marks: "+total);
        System.out.println("Average  Percentage: "+ avg +"%");
        System.out.println("Grade: "+gr);
      
    }
  
    public static void main(String[] args) 
    {
       
        Task2 obj=new Task2();
        obj.gradeCal();
    }
   
}
