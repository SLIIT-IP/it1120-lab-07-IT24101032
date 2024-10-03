import java.util.Scanner;
public class IT24101032Lab7Q1b
{
    public static void main(String[]args)
    {
      
        Scanner input = new Scanner(System.in);

        //student 1
        System.out.println("Student 1");
        int mark1,mark2,mark3,mark4;

        System.out.print("Enter marks for subject 1: ");
        mark1 = input.nextInt();
        System.out.print("Enter marks for subject 2: ");
        mark2 = input.nextInt();
        System.out.print("Enter marks for subject 3: ");
        mark3 = input.nextInt();
        System.out.print("Enter marks for subject 4: ");
        mark4 = input.nextInt();

        System.out.println(mark1+" "+mark2+" "+mark3+" "+mark4);
        double average = (mark1 + mark2 + mark3 + mark4)/4.0;
        System.out.println("Average is:" +average);

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

        //student 2
        System.out.println("Student 2");
        int mark5,mark6,mark7,mark8;

        System.out.print("Enter marks for subject 1: ");
        mark5 = input.nextInt();
        System.out.print("Enter marks for subject 2: ");
        mark6 = input.nextInt();
        System.out.print("Enter marks for subject 3: ");
        mark7 = input.nextInt();
        System.out.print("Enter marks for subject 4: ");
        mark8 = input.nextInt(); 

        System.out.println(mark5+" "+mark6+" "+mark7+" "+mark8);
        average = (mark5 + mark6 + mark7 + mark8)/4.0;
        System.out.println("Average is:" +average);

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

        //student 3
        System.out.println("Student 3");
        int mark9,mark10,mark11,mark12;

        System.out.print("Enter marks for subject 1: ");
        mark9 = input.nextInt();
        System.out.print("Enter marks for subject 2: ");
        mark10 = input.nextInt();
        System.out.print("Enter marks for subject 3: ");
        mark11 = input.nextInt();
        System.out.print("Enter marks for subject 4: ");
        mark12 = input.nextInt();

        System.out.println(mark9+" "+mark10+" "+mark11+" "+mark12);
        average = (mark9 + mark10 + mark11 + mark12)/4.0;
        System.out.println("Average is:" +average);

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