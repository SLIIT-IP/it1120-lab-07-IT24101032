import java.util.Scanner;
public class IT24101032Lab7Q1A
{
    public static void main(String[] args)
    {
         Scanner input = new Scanner (System.in);
         System.out.println("Enter marks for four subjects:");
         System.out.print("Enter subject mark 1:");
         int mark1 = input.nextInt();

         System.out.print("Enter subject mark 2:");
         int mark2 = input.nextInt();

         System.out.print("Enter subject mark 3:");
         int mark3 = input.nextInt();

         System.out.print
         ("Enter subject mark 4:");
         int mark4 = input.nextInt();

         double average = (mark1 + mark2 + mark3 + mark4)/4;
         System.out.println("Average is:" + average);

         if(75<average && average<100)
        {
            System.out.println ("Overall Grade is : Distinction");

        }
         else if(50<average && average<74)
        {
            System.out.println ("Overall Grade is : Credit");

        }
         else
        {
            System.out.println ("Overall Grade is : Fail");

        }
        input.close();
    }
}