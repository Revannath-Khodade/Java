import java.util.Scanner;
class Main 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        byte roll , phy , chem, math;
        short total;
        float per;
        char grade;
        
        System.out.print("Enter Roll NO :");
        roll = sc.nextByte();
        
        System.out.print("Enter Phy Marks :");
        phy = sc.nextByte();
        
        System.out.print("Enter chem Marks :");
        chem = sc.nextByte();
        
        System.out.print("Enter Math Marks :");
        math = sc.nextByte();
        
        total = (short)(phy+chem+math);
        per = total/3;
        
        if(per>75)
        {
            grade='A';
        }
        else if(per>60)
        {
            grade='B';
        }
        else if(per>45)
        {
            grade='C';
        }
        else
        {
            grade='F';
        }
        
        System.out.println("Roll.    Total.    Per.    Grade");
        System.out.print(roll+"         "+total+"     "+per+"     "+grade );
    }
}