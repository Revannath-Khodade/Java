//Java code Library Late days books issue
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int days;
        float charges=0;
        
        System.out.print("Enter Late Days :");
        days = sc.nextInt();
        
        if(days>30)
        {
            System.out.print("Membership Cancleed");
        }
        else if(days>10)
        {
            charges=(float)((1.5*5)+(5*3)+((days-10) * 5));
        }
        else if(days>5)
        {
            charges=(float)((1.5*5)+((days-5) * 3));
        }
        else if(days>10)
        {
            charges=(float)(1.5*days);
        }
        else
        {
            System.out.print("Invalid Days :"+days);
        }
        
        System.out.print("Total Charges is :"+charges);
    }
}